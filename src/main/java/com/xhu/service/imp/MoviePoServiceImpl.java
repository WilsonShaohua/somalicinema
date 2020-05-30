package com.xhu.service.imp;

import com.xhu.mapper.*;
import com.xhu.po.*;
import com.xhu.service.MoviePoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liu li
 * @date 2020/5/28 21:47
 */
@Slf4j
@Service
public class MoviePoServiceImpl implements MoviePoService {
    @Autowired
    private CityMapper cityMapper;

    @Autowired
    private ProvinceMapper provinceMapper;

    @Autowired
    private WorldCountryMapper worldCountryMapper;

    @Autowired
    private ActorMapper actorMapper;
    @Autowired
    private MovieActorsMapper movieActorsMapper;

    @Autowired
    private MovieTypeMapper movieTypeMapper;

    @Autowired
    private MovieMapper movieMapper;

    @Override
    public List<MoviePo> findMoviePoByMovies(List<Movie> movies) {
        List<MoviePo> moviePos = new ArrayList<>();
        for (Movie movie : movies) {
            MoviePo moviePo = findMoviePoByMovie(movie);
            moviePos.add(moviePo);
        }
        log.info(moviePos.toString());
        return moviePos;
    }

    @Override
    public MoviePo findMoviePoByMovie(Movie movie) {
        City city = cityMapper.selectByPrimaryKey(movie.getCityId());
        WorldCountry worldCountry = null;
        if (city != null) {
            Province province = provinceMapper.selectByPrimaryKey(city.getProvinceId());
            worldCountry = worldCountryMapper.selectByPrimaryKey(province.getWorldCountryId());
        }

        MovieType movieType = movieTypeMapper.selectByPrimaryKey(movie.getMovieTypeId());
        MovieActorsExample movieActorsExample = new MovieActorsExample();
        MovieActorsExample.Criteria movieActorsCriteria = movieActorsExample.createCriteria();
        movieActorsCriteria.andMovieIdEqualTo(movie.getMovieId());
        List<MovieActors> movieActorsList = movieActorsMapper.selectByExample(movieActorsExample);
        List<String> actorIds = new ArrayList<>();
        List<Actor> actors = null;
        if (null == actorIds && actorIds.size() > 0) {
            for (MovieActors movieActors : movieActorsList) {
                actorIds.add(movieActors.getActorId());
            }
            ActorExample actorExample = new ActorExample();
            ActorExample.Criteria actorCriteria = actorExample.createCriteria();
            actorCriteria.andActorIdIn(actorIds);
            actors = actorMapper.selectByExample(actorExample);
        }

        return new MoviePo(movie, actors, worldCountry, movieType);
    }

    @Override
    public MoviePo findMoviePoByMovieId(String movieId) {
        Movie movie = movieMapper.selectByPrimaryKey(movieId);
        return findMoviePoByMovie(movie);
    }

    @Override
    public List<MoviePo> findMoviePoByMovieIds(List<String> movieIds) {
        List<MoviePo> moviePos = new ArrayList<>();
        for (String movieId : movieIds) {
            moviePos.add(findMoviePoByMovieId(movieId));
        }
        return moviePos;
    }
}
