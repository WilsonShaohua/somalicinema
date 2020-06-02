package com.xhu.service;

import com.xhu.po.Movie;

import java.util.Date;
import java.util.List;

/**
 * @author liu li
 * @date 2020/5/28 20:27
 */
public interface FieldService {
    List<Movie> findMovieAfterNow();

    List<String> findTodayFeild();

    List<Movie> findMovieAfterDate(Date date);
}
