package com.xhu.service;

import com.xhu.po.Actor;
import com.xhu.po.Movie;
import com.xhu.po.MovieActors;

import java.util.List;
import java.util.Set;

/**
 * @author liu li
 * @date 2020/5/27 19:38
 */
public interface MovieActorService {
    MovieActors findMovieActorById(String movieActorId);

    Set<Actor> findActorByMovieId(String movieId);

    Set<Actor> findActorByMovieId(List<String> movieIds);

    Set<Movie> findMvoieByActorId(String actorId);

    Set<Movie> findMvoieByActorId(List<String> actorId);

}
