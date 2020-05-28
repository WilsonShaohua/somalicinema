package com.xhu.mapper;

import com.xhu.po.MovieType;
import com.xhu.po.MovieTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MovieTypeMapper {
    long countByExample(MovieTypeExample example);

    int deleteByExample(MovieTypeExample example);

    int deleteByPrimaryKey(String movieTypeId);

    int insert(MovieType record);

    int insertSelective(MovieType record);

    List<MovieType> selectByExample(MovieTypeExample example);

    MovieType selectByPrimaryKey(String movieTypeId);

    int updateByExampleSelective(@Param("record") MovieType record, @Param("example") MovieTypeExample example);

    int updateByExample(@Param("record") MovieType record, @Param("example") MovieTypeExample example);

    int updateByPrimaryKeySelective(MovieType record);

    int updateByPrimaryKey(MovieType record);
}