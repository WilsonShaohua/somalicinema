package com.xhu.service.imp;

import com.xhu.mapper.ActorMapper;
import com.xhu.mapper.MovieActorsMapper;
import com.xhu.mapper.MovieMapper;
import com.xhu.po.*;
import com.xhu.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author liu li
 * @date 2020/5/25 9:28
 */
@Service
public class ActorServiceImpl implements ActorService {
    @Autowired
    private ActorMapper actorMapper;
    @Autowired
    private MovieMapper movieMapper;
    @Autowired
    private MovieActorsMapper movieActorsMapper;

    @Override
    public int addActor(Actor actor) {
        return actorMapper.insertSelective(actor);
    }

    @Override
    public void addActor(List<Actor> actors) {

    }

    @Override
    public void updateActor(Actor actor) {

    }

    @Override
    public void deleteActorByActorId(String actor_id) {

    }

    @Override
    public void delteActors(List<Actor> actors) {

    }

    @Override
    public Actor selectActorById(String actor_id) {
        return actorMapper.selectByPrimaryKey(actor_id);

    }

    @Override
    public Set<Movie> findActorMoviesByActorId(String actorId) {
        MovieActorsExample movieActorsExample = new MovieActorsExample();

        MovieExample movieExample = new MovieExample();
        MovieExample.Criteria criteria = movieExample.createCriteria();

        return null;
    }

    /**
     * 查用相关演员名字的电影
     *
     * @param actorName
     * @return
     */
    @Override
    public Set<Movie> findActorMoviesByActorName(String actorName) {
        ActorExample actorExample = new ActorExample();
        ActorExample.Criteria actorCriteria = actorExample.createCriteria();
        //查询该名字类似的演员
        actorCriteria.andActorNameLike(actorName);
        List<Actor> actors = actorMapper.selectByExample(actorExample);
        Set<Movie> movies = new HashSet<>();
        for (Actor actor : actors) {
            movies.addAll(findActorMoviesByActorId(actor.getActorId()));
        }
        return movies;
    }

    @Override
    public Set<String> searchAcotrId(String[] conditions) {
        //查询电影的id集合
        Set<String> movieIds = new HashSet<>();
        //演员信息检索
        ActorExample actorExample = new ActorExample();
        //存放id集合
        Set<String> actorIdSet = new HashSet<>();
        //查询演员信息
        for (String condition : conditions) {
            ActorExample.Criteria actorNameCriteria = actorExample.createCriteria();
            //演员姓名检索
            actorNameCriteria.andActorNameLike("%" + condition + "%");
            actorExample.or(actorNameCriteria);
            //演员姓名检索
            ActorExample.Criteria actorInfoCriteria = actorExample.createCriteria();
            actorInfoCriteria.andActorIntroductionLike("%" + condition + "%");
            actorExample.or(actorInfoCriteria);
        }
        List<Actor> actorList = actorMapper.selectByExample(actorExample);
        for (Actor actor : actorList) {
            actorIdSet.add(actor.getActorId());
        }
        return actorIdSet;
    }

    @Override
    public List<Actor> selectAll() {

        return actorMapper.selectByExample(new ActorExample());
    }
}
