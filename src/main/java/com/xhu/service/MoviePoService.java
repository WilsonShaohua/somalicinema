package com.xhu.service;

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
}
