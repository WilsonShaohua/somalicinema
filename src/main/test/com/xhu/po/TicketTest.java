package com.xhu.po;

import com.xhu.service.MovieService;
import com.xhu.service.UserService;
import com.xhu.service.WatchedhService;
import com.xhu.utils.KeyProductor;
import com.xhu.utils.SpringTest;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Random;

/**
 * @author liu li
 * @date 2020/6/3 16:56
 */
public class TicketTest extends SpringTest {
    List<User> userList;
    List<Movie> movieList;
    @Autowired
    private MovieService movieService;
    @Autowired
    private WatchedhService watchedhService;
    @Autowired
    private UserService userService;

    @Before
    public void initData() {
        movieList = movieService.selectAll();
        userList = userService.selectAll();
    }

    @Test
    public void createData() {
        String watchedId;
        String userId;
        String movieId;
        double score;
        Random random = new Random();
        for (Movie movie : movieList) {
            movieId = movie.getMovieId();
            for (int i = 0; i < 30; i++) {
                int userIndex = random.nextInt(userList.size());
                userId = userList.get(userIndex).getUserId();
                watchedId = KeyProductor.getKey();
                score = random.nextDouble() * 10;

                Watched watched = new Watched();
                watched.setMovieId(movieId);
                watched.setMovieScore(score);
                watched.setUserId(userId);
                watched.setWatchedId(watchedId);
                try {
                    watchedhService.insert(watched);
                    System.out.println(watched);
                } catch (Exception e) {
                    i--;
                }

            }
        }

    }
}
