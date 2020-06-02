package com.xhu.po;

import com.xhu.mapper.MovieMapper;
import com.xhu.mapper.UserMapper;
import com.xhu.mapper.WantWatchMapper;
import com.xhu.utils.DateUtil;
import com.xhu.utils.KeyProductor;
import com.xhu.utils.SpringTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * @author liu li
 * @date 2020/5/31 18:56
 */
@Slf4j
public class WantWatchTest extends SpringTest {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private MovieMapper movieMapper;
    @Autowired
    private WantWatchMapper wantWatchMapper;

    @Test
    public void insertValue() throws InterruptedException {
        List<User> users = userMapper.selectByExample(new UserExample());
        List<Movie> movies = movieMapper.selectByExample(new MovieExample());
        wantWatchMapper.deleteByExample(new WantWatchExample());
        int length = 10000;
        Random random1 = new Random(users.size() - 1);
        Random random2 = new Random(movies.size() - 1);
        for (int i = 0; i < length; i++) {
            String wantWatchId = KeyProductor.getKey();
            Date now = DateUtil.getCurrentTime();
            int round1 = random1.nextInt(users.size() - 1);
            String userId = users.get(round1).getUserId();
            int round2 = random2.nextInt(movies.size() - 1);
            String movieId = movies.get(round2).getMovieId();
            WantWatch wantWatch = new WantWatch(wantWatchId, movieId, userId, now);

            try {
                wantWatchMapper.insert(wantWatch);
                // log.info(wantWatch.toString());
                System.out.println(i + " : " + wantWatch);
            } catch (Exception e) {
                System.out.println(i + " back");
                i--;
            }
        }
    }
}
