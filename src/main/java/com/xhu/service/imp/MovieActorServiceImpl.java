package com.xhu.service.imp;

import com.xhu.mapper.ActorMapper;
import com.xhu.mapper.MovieActorsMapper;
import com.xhu.mapper.MovieMapper;
import com.xhu.po.*;
import com.xhu.service.MovieActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author liu li
 * @date 2020/5/27 19:40
 */
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
        return movieActorsMapper.selectByPrimaryKey(movieActorId);
    }

    @Override
    public List<Actor> findActorByMovieId(String movieId) {
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
        List<Actor> actors = actorMapper.selectByExample(actorExample);
        return actors;
    }

    @Override
    public List<Movie> findMvoieByActorId(String actorId) {
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
        List<Movie> movies = movieMapper.selectByExample(movieExample);
        return movies;
    }
}
