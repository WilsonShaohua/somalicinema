package com.xhu.po;

import com.xhu.mapper.MovieMapper;
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

    @Autowired
    private MovieMapper movieMapper;

    @Test
    public void setPhoto() {
        String photo = " /img/img21.jpg" +
                " /img/img22.jpeg" +
                " /img/img23.jpg" +
                " /img/img24.jpg" +
                " /img/img25.jpg" +
                " /img/img26.jpg" +
                " /img/img27.jpg" +
                " /img/img28.jpeg" +
                " /img/img13.jpg" +
                " /img/img14.jpg" +
                " /img/img15.jpg" +
                " /img/img16.jpg" +
                " /img/img17.jpg" +
                " /img/img18.jpg" +
                " /img/img19.jpg" +
                " /img/img20.jpg" +
                " /img/img6.jpeg" +
                " /img/img12.jpg" +
                " /img/img11.jpg" +
                " /img/img1.jpg" +
                " /img/img7.jpg" +
                " /img/img8.jpg" +
                " /img/img9.jpg" +
                " /img/img10.jpg" +
                " /img/img2.jpg" +
                " /img/img2.jpg" +
                " /img/img2.jpg" +
                " /img/img2.jpg" +
                " /img/img3.jpg" +
                " /img/img4.jpeg" +
                " /img/img5.jpg" +
                " /img/img2.jpg" +
                " /img/img2.jpg" +
                " /img/img29.jpeg" +
                " /img/img2.jpg" +
                " /img/img28.jpg" +
                " /img/img30.jpg" +
                " /img/img31.jpg" +
                " /img/img19.jpg" +
                " /img/img32.jpg" +
                " /img/img33.jpg" +
                " /img/img34.jpeg" +
                " /img/img35.jpeg";
        String[] photos = photo.split(" ");
        List<Movie> movieList = movieService.selectAll();
        Random random = new Random();
        for (Movie movie : movieList) {
            int index = random.nextInt(photos.length);
            while (photos[index].trim().length() == 0)
                random.nextInt(photos.length);
            log.info(photos[index]);
            movie.setMoviePosterAddress(photos[index]);
            movieMapper.updateByPrimaryKey(movie);
        }
    }
}
