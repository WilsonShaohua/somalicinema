package com.xhu.service.imp;

import com.xhu.mapper.*;
import com.xhu.po.*;
import com.xhu.service.MoviePoService;
import com.xhu.service.TicketService;
import com.xhu.service.WantWatchService;
import com.xhu.service.WatchedhService;
import com.xhu.utils.constant.MovieScreeningConstant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
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
    private YearsMapper yearsMapper;

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

    @Autowired
    private TicketService ticketService;

    @Autowired
    private WantWatchService wantWatchService;

    @Autowired
    private WatchedhService watchedhService;

    @Override
    public List<MoviePo> findMoviePoByMovies(List<Movie> movies) {
        List<MoviePo> moviePos = new ArrayList<>();
        for (Movie movie : movies) {
            MoviePo moviePo = findMoviePoByMovie(movie);
            moviePo = getWantWatchAmount(moviePo);
            moviePos.add(moviePo);
        }

        return moviePos;
    }

    @Override
    public MoviePo findMoviePoByMovie(Movie movie) {

        WorldCountry worldCountry = worldCountryMapper.selectByPrimaryKey(movie.getWorldCountryId());

        MovieType movieType = movieTypeMapper.selectByPrimaryKey(movie.getMovieTypeId());
        MovieActorsExample movieActorsExample = new MovieActorsExample();
        MovieActorsExample.Criteria movieActorsCriteria = movieActorsExample.createCriteria();
        movieActorsCriteria.andMovieIdEqualTo(movie.getMovieId());
        List<MovieActors> movieActorsList = movieActorsMapper.selectByExample(movieActorsExample);
        List<String> actorIds = new ArrayList<>();
        for (MovieActors movieActors : movieActorsList) {
            actorIds.add(movieActors.getActorId());
        }
        List<Actor> actors = null;
        if (null != actorIds && actorIds.size() > 0) {
            for (MovieActors movieActors : movieActorsList) {
                actorIds.add(movieActors.getActorId());
            }
            ActorExample actorExample = new ActorExample();
            ActorExample.Criteria actorCriteria = actorExample.createCriteria();
            actorCriteria.andActorIdIn(actorIds);
            actors = actorMapper.selectByExample(actorExample);
        }

        MoviePo moviePo = new MoviePo();
        moviePo.setMovie(movie);
        moviePo.setArea(worldCountry);
        moviePo.setActors(actors);
        moviePo.setMovieType(movieType);
        moviePo = getWantWatchAmount(moviePo);
        moviePo = getScore(moviePo);
        return moviePo;
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

    @Override
    public MoviePo getScore(MoviePo moviePo) {
        Movie movie = moviePo.getMovie();
        double score = watchedhService.movieScoreByMovieId(movie.getMovieId());
        moviePo.setScore(score);
        return moviePo;
    }

    @Override
    public List<MoviePo> getScore(List<MoviePo> moviePoList) {
        List<MoviePo> moviePos = new ArrayList<>();
        for (MoviePo moviePo : moviePoList) {
            moviePo = getScore(moviePo);
            moviePos.add(moviePo);
        }
        return moviePos;
    }

    @Override
    public MoviePo getTicketAmount(MoviePo moviePo) {
        Movie movie = moviePo.getMovie();
        long ticketAmount = ticketService.countTicketAmountByMovieId(movie.getMovieId());
        moviePo.setTicketAmount(ticketAmount);
        return moviePo;
    }

    @Override
    public List<MoviePo> getTicketAmount(List<MoviePo> moviePoList) {
        List<MoviePo> moviePos = new ArrayList<>();
        for (MoviePo moviePo : moviePoList) {
            moviePo = getTicketAmount(moviePo);
            moviePos.add(moviePo);
        }

        return moviePos;
    }

    @Override
    public MoviePo getSalledMoney(MoviePo moviePo) {
        Movie movie = moviePo.getMovie();
        BigDecimal money = ticketService.countIicketTotalBox(movie.getMovieId());
        if (money == null)
            money = BigDecimal.ZERO;
        moviePo.setSalledMoney(money);
        return moviePo;
    }

    @Override
    public List<MoviePo> getSalledMoney(List<MoviePo> moviePoList) {
        List<MoviePo> moviePos = new ArrayList<>();
        for (MoviePo moviePo : moviePoList) {
            moviePo = getSalledMoney(moviePo);
            moviePos.add(moviePo);
        }
        return moviePos;
    }

    @Override
    public MoviePo getTodaySalledMoney(MoviePo moviePo) {
        Movie movie = moviePo.getMovie();
        BigDecimal money = ticketService.countTicketTodayBox(movie.getMovieId());
        if (money == null)
            money = BigDecimal.ZERO;
        moviePo.setTodaySalledMoney(money);
        return moviePo;
    }

    @Override
    public List<MoviePo> getTodaySalledMoney(List<MoviePo> moviePoList) {
        List<MoviePo> moviePos = new ArrayList<>();
        for (MoviePo moviePo : moviePoList) {
            moviePo = getTodaySalledMoney(moviePo);
            moviePos.add(moviePo);
        }
        return moviePos;
    }

    @Override
    public MoviePo getWantWatchAmount(MoviePo moviePo) {
        Movie movie = moviePo.getMovie();
        long total = wantWatchService.countTotalWantByMovieId(movie.getMovieId());
        moviePo.setWantWatch(total);
        return moviePo;
    }

    @Override
    public List<MoviePo> getWantWatchAmount(List<MoviePo> moviePoList) {
        List<MoviePo> moviePos = new ArrayList<>();
        for (MoviePo moviePo : moviePoList) {
            moviePo = getTodaySalledMoney(moviePo);
            moviePos.add(moviePo);
        }
        return moviePos;
    }


    @Override
    public List<MoviePo> selectByScreeningConditions(String areaId, String typeId, String yearsId) {
        MovieExample movieExample = new MovieExample();
        MovieExample.Criteria criteria = movieExample.createCriteria();
        //添加地区查询
        if (null != areaId && MovieScreeningConstant.ALL_AREA_ID.equals(areaId.trim()) == false) {
            criteria.andWorldCountryIdEqualTo(areaId);
        }
        //添加类型查询
        if (null != typeId && MovieScreeningConstant.ALL_TYPE_ID.equals(typeId.trim()) == false) {
            criteria.andMovieTypeIdEqualTo(typeId.trim());

        }
        //添加年代查询
        if (null != yearsId && MovieScreeningConstant.ALL_YEARS_ID.equals(yearsId.trim()) == false) {
            Years years = yearsMapper.selectByPrimaryKey(yearsId.trim());
            if (null != years.getYearsStartYear() && null != years.getYearsEndtYear()) {
                criteria.andMoviePublishingDataBetween(years.getYearsStartYear(), years.getYearsEndtYear());
            } else {
                criteria.andMoviePublishingDataLessThan(years.getYearsEndtYear());
            }

        }
        //查询符合条件的影片
        List<Movie> movies = movieMapper.selectByExample(movieExample);

        //返回查询符合条件的影片信息
        return findMoviePoByMovies(movies);

    }

    @Override
    public List<MoviePo> selectByScreeningConditions(Condition condition, List<MoviePo> moviePos) {
        MovieExample movieExample = new MovieExample();
        MovieExample.Criteria criteria = movieExample.createCriteria();
        if (moviePos == null || moviePos.size() == 0) return null;
        List<String> movieIdList = new ArrayList<>();
        for (MoviePo moviePo : moviePos) {
            movieIdList.add(moviePo.getMovie().getMovieId());
        }
        criteria.andMovieIdIn(movieIdList);
        String areaId = condition.getAreaId();
        String typeId = condition.getTypeId();
        String yearsId = condition.getYearsId();

        //添加地区查询
        if (null != areaId && MovieScreeningConstant.ALL_AREA_ID.equals(areaId.trim()) == false) {
            criteria.andWorldCountryIdEqualTo(areaId);
        }
        //添加类型查询
        if (null != typeId && MovieScreeningConstant.ALL_TYPE_ID.equals(typeId.trim()) == false) {
            criteria.andMovieTypeIdEqualTo(typeId.trim());

        }
        //添加年代查询
        if (null != yearsId && MovieScreeningConstant.ALL_YEARS_ID.equals(yearsId.trim()) == false) {
            Years years = yearsMapper.selectByPrimaryKey(yearsId.trim());
            if (null != years.getYearsStartYear() && null != years.getYearsEndtYear()) {
                criteria.andMoviePublishingDataBetween(years.getYearsStartYear(), years.getYearsEndtYear());
            } else {
                criteria.andMoviePublishingDataLessThan(years.getYearsEndtYear());
            }

        }
        //查询符合条件的影片
        List<Movie> movies = movieMapper.selectByExample(movieExample);

        //返回查询符合条件的影片信息
        return findMoviePoByMovies(movies);

    }
}
