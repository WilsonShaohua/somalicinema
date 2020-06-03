package com.xhu.po;

import com.xhu.service.FieldService;
import com.xhu.service.MovieService;
import com.xhu.utils.DateUtil;
import com.xhu.utils.KeyProductor;
import com.xhu.utils.SpringTest;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author liu li
 * @date 2020/6/3 16:14
 */
public class FieldTest extends SpringTest {
    @Autowired
    private MovieService movieService;
    @Autowired
    private FieldService fieldService;
    private List<Movie> movieList;

    @Before
    public void initData() {
        movieList = movieService.selectAll();

    }

    @Test
    public void createData() {
        String id;
        String movieId;
        String screeningRoomId = "1001001001";
        Date startDate = DateUtil.getCurrentTime();
        BigDecimal money = new BigDecimal(33.6);
        for (Movie movie : movieList) {
            movieId = movie.getMovieId();
            for (int i = 0; i < 7; i++) {
                id = KeyProductor.getKey();
                Calendar c = Calendar.getInstance();
                c.setTime(startDate);

                c.add(Calendar.DAY_OF_MONTH, i);
                Date fieldDate = c.getTime();//这是明天
                Field field = new Field(id, screeningRoomId, movieId, fieldDate, money);
                System.out.println(field);
                try {
                    fieldService.insert(field);
                } catch (Exception e) {
                    System.out.println("insert error");
                }
            }
        }
    }

}
