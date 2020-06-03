package com.xhu.po;

import com.xhu.service.ActorRoleService;
import com.xhu.service.ActorService;
import com.xhu.service.MovieActorService;
import com.xhu.service.MovieService;
import com.xhu.utils.KeyProductor;
import com.xhu.utils.SpringTest;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Random;

/**
 * @author liu li
 * @date 2020/6/3 15:44
 */
public class MovieArctorTest extends SpringTest {
    @Autowired
    private MovieService movieService;
    @Autowired
    private ActorService actorService;
    @Autowired
    private ActorRoleService actorRoleService;
    @Autowired
    private MovieActorService movieActorService;

    private List<Movie> movieList;
    private List<Actor> actorList;
    private List<ActorRole> actorRoleList;

    @Before
    public void initData() {
        movieList = movieService.selectAll();
        actorList = actorService.selectAll();
        actorRoleList = actorRoleService.selectAll();
    }

    @Test
    public void createData() {
        String id = null;
        String actorId = null;
        String movieId = null;
        String actorRoleId = null;
        Random random = new Random();
        int index;
        for (Movie movie : movieList) {
            movieId = movie.getMovieId();
            int n = random.nextInt(2) + 2;
            for (int i = 0; i < n; i++) {
                id = KeyProductor.getKey();
                index = random.nextInt(actorList.size());
                actorId = actorList.get(index).getActorId();
                index = random.nextInt(actorRoleList.size());
                actorRoleId = actorRoleList.get(index).getActorRoleId();
                MovieActors movieActors = new MovieActors(id, actorId, movieId, actorRoleId);
                System.out.println(movieActors);
                movieActorService.insert(movieActors);
            }
        }
    }
}
