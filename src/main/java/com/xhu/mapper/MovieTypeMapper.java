package com.xhu.mapper;

import com.xhu.po.MovieTypeExample;
import com.xhu.po.MovieTypeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MovieTypeMapper {
    long countByExample(MovieTypeExample example);

    int deleteByExample(MovieTypeExample example);

    int deleteByPrimaryKey(MovieTypeKey key);

    int insert(MovieTypeKey record);

    int insertSelective(MovieTypeKey record);

    List<MovieTypeKey> selectByExample(MovieTypeExample example);

    int updateByExampleSelective(@Param("record") MovieTypeKey record, @Param("example") MovieTypeExample example);

    int updateByExample(@Param("record") MovieTypeKey record, @Param("example") MovieTypeExample example);
}