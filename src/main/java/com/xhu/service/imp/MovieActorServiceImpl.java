package com.xhu.service.imp;

import com.xhu.mapper.ActorMapper;
import com.xhu.mapper.MovieActorsMapper;
import com.xhu.mapper.MovieMapper;
import com.xhu.po.*;
import com.xhu.service.MovieActorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author liu li
 * @date 2020/5/27 19:40
 */
@Slf4j
@Service
public class MovieActorServiceImpl implements MovieActorService {
    @Autowired
    private MovieActorsMapper movieActorsMapper;
    @Autowired
    private ActorMapper actorMapper;
    @Autowired
    private MovieMapper movieMapper;

    @Override
    public MovieActors findMovieActorById(String movieActorId) {
        if (movieActorId == null) return null;
        return movieActorsMapper.selectByPrimaryKey(movieActorId);
    }

    @Override
    public Set<Actor> findActorByMovieId(String movieId) {
        if (movieId == null) return null;
        MovieActorsExample movieActorsExample = new MovieActorsExample();
        MovieActorsExample.Criteria criteria = movieActorsExample.createCriteria();
        criteria.andMovieIdEqualTo(movieId);
        List<MovieActors> movieActorsList = movieActorsMapper.selectByExample(movieActorsExample);
        List<String> actorIds = new ArrayList<>();
        for (MovieActors movieActors : movieActorsList) {
            actorIds.add(movieActors.getActorId());
        }
        ActorExample actorExample = new ActorExample();
        ActorExample.Criteria actorCriteria = actorExample.createCriteria();
        actorCriteria.andActorIdIn(actorIds);
        Set<Actor> actors = new HashSet<Actor>() {{
            actorMapper.selectByExample(actorExample);
        }};
        return actors;
    }

    @Override
    public Set<Actor> findActorByMovieId(List<String> movieIds) {
        if (movieIds == null || movieIds.size() == 0)
            return null;
        Set<Actor> actors = new HashSet<>();
        for (String movieId : movieIds) {
            actors.addAll(findActorByMovieId(movieId));
        }
        return actors;
    }

    @Override
    public Set<Movie> findMvoieByActorId(String actorId) {
        if (actorId == null)
            return null;
        MovieActorsExample movieActorsExample = new MovieActorsExample();
        MovieActorsExample.Criteria criteria = movieActorsExample.createCriteria();
        criteria.andActorIdEqualTo(actorId);
        List<MovieActors> movieActorsList = movieActorsMapper.selectByExample(movieActorsExample);
        List<String> movieIds = new ArrayList<>();
        for (MovieActors movieActors : movieActorsList) {
            movieIds.add(movieActors.getActorId());
        }
        MovieExample movieExample = new MovieExample();
        MovieExample.Criteria movieCriteria = movieExample.createCriteria();
        movieCriteria.andMovieIdIn(movieIds);
        Set<Movie> movies = new HashSet<Movie>(movieMapper.selectByExample(movieExample));
        return movies;
    }

    @Override
    public Set<Movie> findMvoieByActorId(List<String> actorIds) {
        if (actorIds == null || actorIds.size() == 0)
            return null;
        MovieActorsExample movieActorsExample = new MovieActorsExample();
        MovieActorsExample.Criteria criteria = movieActorsExample.createCriteria();
        criteria.andActorIdIn(actorIds);
        List<MovieActors> movieActorsList = movieActorsMapper.selectByExample(movieActorsExample);

        List<String> movieIds = new ArrayList<>();
        for (MovieActors movieActors : movieActorsList) {
            movieIds.add(movieActors.getActorId());
        }
        MovieExample movieExample = new MovieExample();
        MovieExample.Criteria movieCriteria = movieExample.createCriteria();
        if (movieIds != null && movieIds.size() > 0)
            movieCriteria.andMovieIdIn(movieIds);
        List<Movie> movieList = movieMapper.selectByExample(movieExample);

        Set<Movie> movieSet = new HashSet<>();
        movieSet.addAll(movieList);

        return movieSet;
    }

    @Override
    public void insert(MovieActors movieActors) {
        movieActorsMapper.insert(movieActors);
    }
}
