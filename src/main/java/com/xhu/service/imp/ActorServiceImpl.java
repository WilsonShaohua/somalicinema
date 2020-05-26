package com.xhu.service.imp;

import com.xhu.mapper.ActorMapper;
import com.xhu.po.Actor;
import com.xhu.po.ActorExample;
import com.xhu.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liu li
 * @date 2020/5/25 9:28
 */
@Service
public class ActorServiceImpl implements ActorService {
    @Autowired
    private ActorMapper actorMapper;

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
}
