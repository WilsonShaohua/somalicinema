package com.xhu.service;

import com.xhu.po.Condition;
import com.xhu.po.Movie;
import com.xhu.po.MoviePo;

import java.util.List;

/**
 * @author liu li
 * @date 2020/5/28 21:45
 */
public interface MoviePoService {
    List<MoviePo> findMoviePoByMovies(List<Movie> movies);

    MoviePo findMoviePoByMovie(Movie movie);

    MoviePo findMoviePoByMovieId(String movieId);

    List<MoviePo> findMoviePoByMovieIds(List<String> movieIds);

    //获取评分
    MoviePo getScore(MoviePo moviePo);

    List<MoviePo> getScore(List<MoviePo> moviePoList);

    //获取票数
    MoviePo getTicketAmount(MoviePo moviePo);

    List<MoviePo> getTicketAmount(List<MoviePo> moviePoList);

    //获取票房
    MoviePo getSalledMoney(MoviePo moviePo);

    List<MoviePo> getSalledMoney(List<MoviePo> moviePoList);

    //获取今日票房
    MoviePo getTodaySalledMoney(MoviePo moviePo);

    List<MoviePo> getTodaySalledMoney(List<MoviePo> moviePoList);

    //获取想看人数
    MoviePo getWantWatchAmount(MoviePo moviePo);

    List<MoviePo> getWantWatchAmount(List<MoviePo> moviePoList);

    List<MoviePo> selectByScreeningConditions(String areaId, String typeId, String yearsId);

    List<MoviePo> selectByScreeningConditions(Condition condition, List<MoviePo> moviePos);
}
