package com.xhu.service.imp;

import com.xhu.mapper.MovieMapper;
import com.xhu.po.Movie;
import com.xhu.po.MovieExample;
import com.xhu.utils.DateUtil;
import com.xhu.utils.SpringTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liu li
 * @date 2020/5/30 14:26
 */
public class MovieServiceImp extends SpringTest {
    @Autowired
    private MovieMapper movieMapper;

    @Test
    public void findIdIn() {
        List<String> mo = new ArrayList<String>();
        mo.add("1001001014");
        mo.add("1001001012");
        MovieExample movieExample = new MovieExample();
        MovieExample.Criteria movieCriteria = movieExample.createCriteria();
        movieCriteria.andMoviePublishingDataLessThanOrEqualTo(DateUtil.getCurrentTime());
        movieCriteria.andMovieIdIn(mo);
        List<Movie> movies = movieMapper.selectByExample(movieExample);
        System.out.println(movies);
    }
}
