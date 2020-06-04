package com.xhu.service.imp;

import com.xhu.mapper.*;
import com.xhu.po.*;
import com.xhu.service.MovieService;
import com.xhu.utils.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.*;

/**
 * @author liu li
 * @date 2020/5/27 9:14
 * 未完成，程序有待优化性能
 * 在查询Movie时可使用TreeSet作为方法类型，而使用List不具有自动去重功能，如果要完成去重功能，需要较大的性能代价
 */
@Slf4j
@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieMapper movieMapper;

    @Autowired
    private FieldMapper fieldMapper;

    @Autowired
    private CinemaMapper cinemaMapper;

    @Autowired
    private ScreeningRoomMapper screeningRoomMapper;

    @Autowired
    private WorldCountryMapper worldCountryMapper;

    @Autowired
    private ProvinceMapper provinceMapper;

    @Autowired
    private CityMapper cityMapper;

    /**
     * 根据电影名字模糊查询电影
     *
     * @param movieName
     * @return
     */
    @Override
    public List<Movie> findMovieByMovieName(String movieName) {

        MovieExample movieExample = new MovieExample();
        MovieExample.Criteria movieCriteria = movieExample.createCriteria();

        movieCriteria.andMovieNameLike(movieName);
        List<Movie> movies = movieMapper.selectByExample(movieExample);
        return movies;
    }

    /**
     * 通过电影id查找电影
     *
     * @param movieId
     * @return
     */
    @Override
    public Movie findMovieByMovieId(String movieId) {
        return movieMapper.selectByPrimaryKey(movieId);
    }

    /**
     * 同通过电影类型id查找电影
     *
     * @param movieTypeId
     * @return
     */
    @Override
    public List<Movie> findMovieByMovieTypeId(String movieTypeId) {
        MovieExample movieExample = new MovieExample();
        MovieExample.Criteria movieCriteria = movieExample.createCriteria();
        movieCriteria.andMovieTypeIdEqualTo(movieTypeId);
        List<Movie> movies = movieMapper.selectByExample(movieExample);
        return movies;
    }

    @Override
    public List<Movie> findMovieByMovieTypeId(List<String> movieTypeId) {
        if (movieTypeId == null || movieTypeId.size() == 0) return null;
        MovieExample movieExample = new MovieExample();
        MovieExample.Criteria criteria = movieExample.createCriteria();
        criteria.andMovieTypeIdIn(movieTypeId);
        List<Movie> movieList = movieMapper.selectByExample(movieExample);
        return movieList;
    }

    /**
     * 查找特定类型名的影片，并且限制数量
     * 模糊查询类型名
     *
     * @param orderType
     * @param limit
     * @return
     */
    @Override
    public List<Movie> findMovieByMovieTypeIdLimit(String orderType, int limit) {
        MovieExample movieExample = new MovieExample();
        MovieExample.Criteria movieCriteria = movieExample.createCriteria();
        movieCriteria.andMovieTypeIdEqualTo(orderType);
        movieExample.setOrderByClause("movie_type_id limit " + limit);
        return null;
    }

    /**
     * 查找当前时刻之后的所有排片安排
     *
     * @return
     */
    @Override
    public List<Movie> findMovieByMoviePublishingDate() {
        //获取系统时间
        Date nowDate = DateUtil.getCurrentTime();
        MovieExample movieExample = new MovieExample();
        MovieExample.Criteria movieCriteria = movieExample.createCriteria();
        movieCriteria.andMoviePublishingDataGreaterThan(nowDate);
        List<Movie> movies = movieMapper.selectByExample(movieExample);
        return movies;
    }

    /**
     * 按日期查找电影
     *
     * @param date
     * @return
     */
    @Override
    public List<Movie> findMovieByDate(Date date) throws ParseException {

        date = DateUtil.getDayStart(date);

        Date nextDay = DateUtils.addDays(date, 1);
        /**
         * 获取场次晚于当前时间的信息
         */
        FieldExample fieldExample = new FieldExample();
        FieldExample.Criteria fieldCriteria = fieldExample.createCriteria();

        //获取当天，现在之后的排片数据
        fieldCriteria.andFieldStartDataTimeBetween(date, nextDay);
        //对上映时间进行排序
        fieldExample.setOrderByClause("field_start_date_time");
        //获取档期安排数据
        List<Field> fields = fieldMapper.selectByExample(fieldExample);
        //场次安排为空时 返回null
        if (null == fields || fields.size() == 0) return null;
        /**
         * 获取电影id，并去重
         */
        List<String> movieIds = new LinkedList<>();
        for (Field field : fields) {
            //如果该场次的电影id不存在列表中，则将该电影id加入movieIds
            if (movieIds.contains(field.getMovieId()) == false) {
                movieIds.add(field.getMovieId());
            }
        }
        /**
         * 获取电影信息
         */
        MovieExample movieExample = new MovieExample();
        MovieExample.Criteria movieCriteria = movieExample.createCriteria();
        //将电影ids加入查询条件
        movieCriteria.andMovieIdIn(movieIds);
        List<Movie> movies = movieMapper.selectByExample(movieExample);
        return movies;
    }

    @Override
    public List<Movie> findMovieByCompanyId(String companyId) {
        CinemaExample cinemaExample = new CinemaExample();
        CinemaExample.Criteria cinemaCriteria = cinemaExample.createCriteria();
        cinemaCriteria.andCompanyIdEqualTo(companyId);
        List<Cinema> cinemas = cinemaMapper.selectByExample(cinemaExample);
        List<Movie> movies = new ArrayList<>();
        for (Cinema cinema : cinemas) {
            movies.addAll(findMovieByCinemaId(cinema.getCinemaId()));
        }
        return movies;
    }

    /**
     * 根据影院id查询电影
     *
     * @param cinemaId
     * @return
     */
    @Override
    public List<Movie> findMovieByCinemaId(String cinemaId) {
        ScreeningRoomExample screeningRoomExample = new ScreeningRoomExample();
        ScreeningRoomExample.Criteria screeningRoomCriteria = screeningRoomExample.createCriteria();
        List<ScreeningRoom> screeningRooms = screeningRoomMapper.selectByExample(screeningRoomExample);
        List<Movie> movies = new ArrayList<>();
        for (ScreeningRoom screeningRoom : screeningRooms) {
            movies.addAll(findMovieByScreeningRoomId(screeningRoom.getScreeningRoomId()));
        }
        return movies;
    }

    /**
     * 根据影厅id查找该影厅的档期内的全部电影
     *
     * @param screeningRoomId
     * @return
     */
    @Override
    public List<Movie> findMovieByScreeningRoomId(String screeningRoomId) {
        FieldExample fieldExample = new FieldExample();
        FieldExample.Criteria fieldCriteria = fieldExample.createCriteria();
        //获取当前时间
        Date date = DateUtil.getCurrentTime();
        //查找比当前时间之后的电影篇次
        fieldCriteria.andFieldStartDataTimeGreaterThanOrEqualTo(date);
        //查找该影厅的篇次
        fieldCriteria.andScreeningRoomIdEqualTo(screeningRoomId);
        //查询
        List<Field> fields = fieldMapper.selectByExample(fieldExample);
        List<String> movieIds = new ArrayList<>();
        for (Field field : fields) {
            if (movieIds.contains(field.getMovieId()) == false)
                movieIds.add(field.getMovieId());
        }
        MovieExample movieExample = new MovieExample();
        MovieExample.Criteria movieCriteria = movieExample.createCriteria();
        //添加查询条件movieIds
        movieCriteria.andMovieIdIn(movieIds);
        //查询
        List<Movie> movies = movieMapper.selectByExample(movieExample);
        return movies;
    }


    @Override
    public List<Movie> findMovieByCinemaName(String cinemaName) {
        CinemaExample cinemaExample = new CinemaExample();
        CinemaExample.Criteria cinemaCriteria = cinemaExample.createCriteria();
        cinemaCriteria.andCinemaNameLike(cinemaName);
        List<Cinema> cinemas = cinemaMapper.selectByExample(cinemaExample);
        Set<Movie> movieSet = new TreeSet<>();
        for (Cinema cinema : cinemas) {
            movieSet.addAll(findMovieByCinemaId(cinema.getCinemaId()));
        }
        List<Movie> movies = new ArrayList<>();
        movies.addAll(movieSet);
        return movies;
    }

    @Override
    public List<Movie> findMovieByCInemaIdAndMovieId(String cinemaId, String movieId) {
        return null;
    }

    @Override
    public List<Movie> findMovieByCityId(String cityId) {
        return null;
    }

    @Override
    public List<Movie> findAllMovie() {
        return movieMapper.selectByExample(new MovieExample());
    }

    //查询某一区域的电影
    @Override
    public List<Movie> findMovieByWorldCountryId(String worldCountryId) {
        MovieExample movieExample = new MovieExample();
        MovieExample.Criteria criteria = movieExample.createCriteria();
        criteria.andWorldCountryIdEqualTo(worldCountryId);
        List<Movie> movies = movieMapper.selectByExample(movieExample);

        return movies;
    }

    @Override
    public List<Movie> findMovieAfterNow() {
        Date now = DateUtil.getCurrentTime();
        MovieExample movieExample = new MovieExample();
        MovieExample.Criteria movieCriteria = movieExample.createCriteria();
        movieCriteria.andMoviePublishingDataGreaterThanOrEqualTo(now);
        List<Movie> movies = movieMapper.selectByExample(movieExample);
        return movies;
    }

    @Override
    public List<Movie> findMovieBeforeNow() {
        Date now = DateUtil.getCurrentTime();
        MovieExample movieExample = new MovieExample();
        MovieExample.Criteria movieCriteria = movieExample.createCriteria();
        movieCriteria.andMoviePublishingDataLessThanOrEqualTo(now);
        List<Movie> movies = movieMapper.selectByExample(movieExample);
        return movies;
    }

    @Override
    public Set<Movie> search(String[] conditions) {
        if (conditions == null || conditions.length == 0) return null;
        MovieExample movieExample = new MovieExample();
        for (String condition : conditions) {
            //影片名
            MovieExample.Criteria movieNameCriteria = movieExample.createCriteria();
            movieNameCriteria.andMovieNameLike("%" + condition + "%");
            movieExample.or(movieNameCriteria);
            //影片介绍信息
            MovieExample.Criteria movieInfoCriteria = movieExample.createCriteria();
            movieInfoCriteria.andMovieIntroductionLike("%" + condition + "%");
            movieExample.or(movieInfoCriteria);
        }
        //查询
        List<Movie> movieList = movieMapper.selectByExample(movieExample);
        log.info("movie list" + movieList.toString());
        return new HashSet<>(movieList);
    }

    @Override
    public void insertMovie(Movie movie) {
        movieMapper.insert(movie);
    }

    @Override
    public List<Movie> selectAll() {
        return movieMapper.selectByExample(new MovieExample());
    }
}
