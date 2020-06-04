package com.xhu.service;

import com.xhu.po.Movie;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * @author liu li
 * @date 2020/5/26 13:19
 */
public interface MovieService {
    /**
     * 按照电影名模糊查询电影
     * @param movieName
     * @return
     */
    List<Movie> findMovieByMovieName(String movieName);

    /**
     * 按照电影id查找电影
     * @param movieId
     * @return
     */
    Movie findMovieByMovieId(String movieId);

    /**
     * 按照电影选定的类型进行排序
     * @param movieTypeId
     * @return
     */
    List<Movie> findMovieByMovieTypeId(String movieTypeId);

    List<Movie> findMovieByMovieTypeId(List<String> movieTypeId);
    /**
     * 按照类型对数据排序取限定数量的值
     * @param orderType
     * @param limit
     * @return
     */
    List<Movie> findMovieByMovieTypeIdLimit(String orderType,int limit);

    /**
     * 查找电影的系统当前时间之后在热映的电影
     * @return
     */
    List<Movie> findMovieByMoviePublishingDate();


    /**
     * 查找指定日期档期的电影
     * @param date
     * @return
     */
    List<Movie> findMovieByDate(Date date) throws ParseException;

    /**
     * 查找指定公司的电影院上映电影
     * @param companyId
     * @return
     */
    List<Movie> findMovieByCompanyId(String companyId);

    /**
     * 查找指定电影院上映电影
     * @param cinemaId
     * @return
     */
    List<Movie> findMovieByCinemaId(String cinemaId);

    /**
     * 通过影厅id查找将要上映的电影
     *
     * @param screeningRoomId
     * @return
     */
    List<Movie> findMovieByScreeningRoomId(String screeningRoomId);
    /**
     * 查找指定名字的电影院的电影（模糊查询）
     * @param cinemaName
     * @return
     */
    List<Movie> findMovieByCinemaName(String cinemaName);

    /**
     * 查找指定电影院的指定电影的档期安排
     * @param cinemaId
     * @param movieId
     * @return
     */
    List<Movie> findMovieByCInemaIdAndMovieId(String cinemaId,String movieId);

    /**
     * 查找指定城市Id的电影
     * @param cityId
     * @return
     */
    List<Movie> findMovieByCityId(String cityId);


    List<Movie> findAllMovie();

    List<Movie> findMovieByWorldCountryId(String movieRegionalId);

    List<Movie> findMovieAfterNow();

    List<Movie> findMovieBeforeNow();

    Set<Movie> search(String[] conditions);

    void insertMovie(Movie movie);

    List<Movie> selectAll();
}
