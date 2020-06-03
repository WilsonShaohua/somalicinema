package com.xhu.service;

import com.xhu.po.MovieType;

import java.util.List;

/**
 * @author liu li
 * @date 2020/5/27 15:00
 */
public interface MovieTypeService {
    List<MovieType> findAllMovieType();

    MovieType findMovieTypeById(String movieTypeId);

    List<MovieType> findMovieTypeByIds(List<String> movieTypeIds);

    int updateMovieType(MovieType movieType);

    int insertMovieType(MovieType movieType);

    int deleteMovieType(String movieType);

    List<MovieType> selectAll();
}
