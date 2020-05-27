package com.xhu.service.imp;

import com.xhu.mapper.*;
import com.xhu.po.*;
import com.xhu.service.MovieService;
import com.xhu.utils.DateUtil;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author liu li
 * @date 2020/5/27 9:14
 */
@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieMapper movieMapper;
    @Autowired
    private FieldMapper fieldMapper;
    @Autowired
    private CompanyMapper companyMapper;
    @Autowired
    private CinemaMapper cinemaMapper;
    @Autowired
    private ScreeningRoomMapper screeningRoomMapper;

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

    @Override
    public List<Movie> findMovieByMovieTypeId(String movieTypeId) {
        MovieExample movieExample = new MovieExample();
        MovieExample.Criteria movieCriteria = movieExample.createCriteria();
        movieCriteria.andMovieTypeIdEqualTo(movieTypeId);
        List<Movie> movies = movieMapper.selectByExample(movieExample);
        return movies;
    }

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
        /**
         * 获取场次晚于当前时间的信息
         */
        FieldExample fieldExample = new FieldExample();
        FieldExample.Criteria fieldCriteria = fieldExample.createCriteria();

        //晚于当前日期
        fieldCriteria.andFieldStartDataTimeGreaterThanOrEqualTo(nowDate);
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

    /**
     * 按日期查找电影
     *
     * @param date
     * @return
     */
    @Override
    public List<Movie> findMovieByDate(Date date) {
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

    @Override
    public List<Movie> findMovieByScreeningRoomId(String screeningRoomId) {
        FieldExample fieldExample = new FieldExample();
        FieldExample.Criteria fieldCriteria = fieldExample.createCriteria();

        List<Movie> movies = new ArrayList<>();

        return movies;
    }


    @Override
    public List<Movie> findMovieByCinemaName(String cinemaName) {
        return null;
    }

    @Override
    public List<Movie> findMovieByCInemaIdAndMovieId(String cinemaId, String movieId) {
        return null;
    }

    @Override
    public List<Movie> findMovieByCityId(String cityId) {
        return null;
    }
}
