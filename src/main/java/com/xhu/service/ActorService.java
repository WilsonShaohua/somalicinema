package com.xhu.service;

import com.xhu.po.Actor;

import java.util.List;

/**
 * @author liu li
 * @date 2020/5/24 12:33
 *
 */
public interface ActorService {
    public int addActor(Actor actor);
    public void addActor(List<Actor> actors);
    public void updateActor(Actor actor);
    public void deleteActorByActorId(String actor_id);
    public void delteActors(List<Actor> actors);
    public Actor selectActorById(String actor_id);

}
