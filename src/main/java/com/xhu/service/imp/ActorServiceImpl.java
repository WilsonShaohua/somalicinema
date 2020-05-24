package com.xhu.service.imp;

import com.xhu.mapper.ActorMapper;
import com.xhu.po.Actor;
import com.xhu.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author liu li
 * @date 2020/5/24 12:35
 */
@Service(value = "actorService")
@Transactional
public class ActorServiceImpl implements ActorService {
    @Autowired
    private ActorMapper actorMapper;
    @Override
    public int addActor(Actor actor) {
        int res = actorMapper.insert(actor);
        return res;
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
        Actor actor = actorMapper.selectByPrimaryKey(actor_id);
        return actor;
    }
}
