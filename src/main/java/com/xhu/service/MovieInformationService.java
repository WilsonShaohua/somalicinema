package com.xhu.service;

import com.xhu.po.Movie;
import com.xhu.po.MovieInformation;

import java.util.List;

/**
 * @author liu li
 * @date 2020/5/28 21:45
 */
public interface MovieInformationService {
    List<MovieInformation> findMovieInformationByMovies(List<Movie> movies);

    MovieInformation findMovieInformationByMovie(Movie movie);

    MovieInformation findMovieInformationByMovieId(String movieId);

    List<MovieInformation> findMovieInformationByMovieIds(List<String> movieIds);
}
