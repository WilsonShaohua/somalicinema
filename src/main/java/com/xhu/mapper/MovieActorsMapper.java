package com.xhu.mapper;

import com.xhu.po.MovieActors;
import com.xhu.po.MovieActorsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MovieActorsMapper {
    long countByExample(MovieActorsExample example);

    int deleteByExample(MovieActorsExample example);

    int deleteByPrimaryKey(String movieActorsId);

    int insert(MovieActors record);

    int insertSelective(MovieActors record);

    List<MovieActors> selectByExample(MovieActorsExample example);

    MovieActors selectByPrimaryKey(String movieActorsId);

    int updateByExampleSelective(@Param("record") MovieActors record, @Param("example") MovieActorsExample example);

    int updateByExample(@Param("record") MovieActors record, @Param("example") MovieActorsExample example);

    int updateByPrimaryKeySelective(MovieActors record);

    int updateByPrimaryKey(MovieActors record);
}