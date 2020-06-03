package com.xhu.po;

import com.xhu.service.MovieService;
import com.xhu.service.MovieTypeService;
import com.xhu.service.WorldCountryService;
import com.xhu.utils.KeyProductor;
import com.xhu.utils.SpringTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * @author liu li
 * @date 2020/6/2 15:41
 */
@Slf4j
public class MovieTest extends SpringTest {
    List<MovieType> movieTypeList;
    List<WorldCountry> worldCountryList;
    @Autowired
    private MovieTypeService movieTypeService;
    @Autowired
    private WorldCountryService worldCountryService;
    @Autowired
    private MovieService movieService;

    @Before
    public void intiInfomation() {
        movieTypeList = movieTypeService.selectAll();
        worldCountryList = worldCountryService.selectAll();
    }

    @Test
    public void createData() {
        Date date = new Date(2020, 6, 1);
        String movieTypeId = null;
        String id = null;
        int len = 30;
        String movieName = "西游记";
        String movieIndtoduction = "师徒四人前往西天大雷音寺求取真经的故事";
        Date movieDurationPalyback = new Date(0, 0, 0, 1, 32);
        String worldCountryId = null;
        Random random = new Random();
        int index = 0;
        for (int i = 0; i < len; i++) {
            id = KeyProductor.getKey();
            index = random.nextInt(movieTypeList.size());
            movieTypeId = movieTypeList.get(index).getMovieTypeId();
            index = random.nextInt(worldCountryList.size());
            worldCountryId = worldCountryList.get(index).getWorldCountryId();
            Movie movie = new Movie(id, movieTypeId, movieName, date, movieIndtoduction, "www.bing.com", "img/photo.jpg", movieDurationPalyback, worldCountryId);
            System.out.println(movie);
            movieService.insertMovie(movie);
        }


    }
}
