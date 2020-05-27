package com.xhu.service;

import com.xhu.po.Actor;
import com.xhu.po.Movie;

import java.util.List;
import java.util.Set;

/**
 * @author liu li
 * @date 2020/5/24 12:33
 */
public interface ActorService {
    int addActor(Actor actor);

    void addActor(List<Actor> actors);

    void updateActor(Actor actor);

    void deleteActorByActorId(String actor_id);

    void delteActors(List<Actor> actors);

    Actor selectActorById(String actor_id);

    Set<Movie> findActorMoviesByActorId(String actorId);

    Set<Movie> findActorMoviesByActorName(String actorName);
}
