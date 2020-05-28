package com.xhu.service.imp;

import com.xhu.mapper.*;
import com.xhu.po.*;
import com.xhu.service.MovieInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liu li
 * @date 2020/5/28 21:47
 */
@Service
public class MovieInformationServiceImpl implements MovieInformationService {
    @Autowired
    private CityMapper cityMapper;

    @Autowired
    private ActorMapper actorMapper;
    @Autowired
    private MovieActorsMapper movieActorsMapper;

    @Autowired
    private MovieTypeMapper movieTypeMapper;

    @Autowired
    private MovieMapper movieMapper;

    @Override
    public List<MovieInformation> findMovieInformationByMovies(List<Movie> movies) {
        List<MovieInformation> movieInformations = new ArrayList<>();
        for (Movie movie : movies) {
            MovieInformation movieInformation = findMovieInformationByMovie(movie);
            movieInformations.add(movieInformation);
        }
        return movieInformations;
    }

    @Override
    public MovieInformation findMovieInformationByMovie(Movie movie) {
        City city = cityMapper.selectByPrimaryKey(movie.getCityId());
        MovieType movieType = movieTypeMapper.selectByPrimaryKey(movie.getMovieTypeId());
        MovieActorsExample movieActorsExample = new MovieActorsExample();
        MovieActorsExample.Criteria movieActorsCriteria = movieActorsExample.createCriteria();
        movieActorsCriteria.andMovieIdEqualTo(movie.getMovieId());
        List<MovieActors> movieActorsList = movieActorsMapper.selectByExample(movieActorsExample);
        List<String> actorIds = new ArrayList<>();
        for (MovieActors movieActors : movieActorsList) {
            actorIds.add(movieActors.getActorId());
        }
        ActorExample actorExample = new ActorExample();
        ActorExample.Criteria actorCriteria = actorExample.createCriteria();
        actorCriteria.andActorIdIn(actorIds);
        List<Actor> actors = actorMapper.selectByExample(actorExample);
        return new MovieInformation(movie, actors, city, movieType);
    }

    @Override
    public MovieInformation findMovieInformationByMovieId(String movieId) {
        Movie movie = movieMapper.selectByPrimaryKey(movieId);
        return findMovieInformationByMovie(movie);
    }

    @Override
    public List<MovieInformation> findMovieInformationByMovieIds(List<String> movieIds) {
        List<MovieInformation> movieInformations = new ArrayList<>();
        for (String movieId : movieIds) {
            movieInformations.add(findMovieInformationByMovieId(movieId));
        }
        return movieInformations;
    }
}
