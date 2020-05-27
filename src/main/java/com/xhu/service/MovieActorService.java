package com.xhu.service;

import com.xhu.po.Actor;
import com.xhu.po.Movie;
import com.xhu.po.MovieActors;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author liu li
 * @date 2020/5/27 19:38
 */
public interface MovieActorService {
    MovieActors findMovieActorById(String movieActorId);

    List<Actor> findActorByMovieId(String movieId);

    List<Movie> findMvoieByActorId(String actorId);
}
