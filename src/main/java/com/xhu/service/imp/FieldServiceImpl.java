package com.xhu.service.imp;

import com.xhu.mapper.FieldMapper;
import com.xhu.mapper.MovieMapper;
import com.xhu.po.Field;
import com.xhu.po.FieldExample;
import com.xhu.po.Movie;
import com.xhu.po.MovieExample;
import com.xhu.service.FieldService;
import com.xhu.utils.DateUtil;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author liu li
 * @date 2020/5/28 20:30
 */
@Service
public class FieldServiceImpl implements FieldService {
    @Autowired
    private FieldMapper fieldMapper;
    @Autowired
    private MovieMapper movieMapper;

    /**
     * 查找比当前玩的定影
     *
     * @return
     */
    @Override
    public List<Movie> findMovieAfterNow() {
        Date now = DateUtil.getCurrentTime();
        return findMovieAfterDate(now);
    }

    /**
     * 查找今日票房和
     *
     * @return
     */
    @Override
    public List<String> findTodayFeild() {
        Date now = DateUtil.getCurrentTime();
        Date today = DateUtil.getDayStart(now);
        Date tomorrow = DateUtils.addDays(today, 1);
        FieldExample fieldExample = new FieldExample();
        fieldExample.setOrderByClause("field_start_data_time asc");
        FieldExample.Criteria fieldCriteria = fieldExample.createCriteria();
        fieldCriteria.andFieldStartDataTimeBetween(today, tomorrow);
        List<Field> fields = fieldMapper.selectByExample(fieldExample);
        Set<String> movieIds = new TreeSet<>();
        for (Field field : fields) {
            movieIds.add(field.getMovieId());
        }
        return new ArrayList<String>() {{
            addAll(movieIds);
        }};
    }

    /**
     * 查找比date晚的电影
     *
     * @param date
     * @return
     */
    @Override
    public List<Movie> findMovieAfterDate(Date date) {
        FieldExample fieldExample = new FieldExample();
        FieldExample.Criteria fieldCriteria = fieldExample.createCriteria();
        //晚于当前时间的电影场次安排
        fieldCriteria.andFieldStartDataTimeGreaterThanOrEqualTo(date);
        List<Field> fields = fieldMapper.selectByExample(fieldExample);
        Set<String> movieIds = new HashSet<>();
        //获取电影id
        for (Field field : fields) {
            movieIds.add(field.getMovieId());
        }
        MovieExample movieExample = new MovieExample();
        MovieExample.Criteria movieCriteria = movieExample.createCriteria();
        movieCriteria.andMoviePublishingDataLessThan(date);
        movieCriteria.andMovieIdIn(new ArrayList<String>() {{
            addAll(movieIds);
        }});
        List<Movie> movies = movieMapper.selectByExample(movieExample);
        return movies;
    }

}
