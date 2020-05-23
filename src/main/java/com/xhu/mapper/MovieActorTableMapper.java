package com.xhu.mapper;

import com.xhu.po.MovieActorTable;
import com.xhu.po.MovieActorTableExample;
import com.xhu.po.MovieActorTableKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MovieActorTableMapper {
    long countByExample(MovieActorTableExample example);

    int deleteByExample(MovieActorTableExample example);

    int deleteByPrimaryKey(MovieActorTableKey key);

    int insert(MovieActorTable record);

    int insertSelective(MovieActorTable record);

    List<MovieActorTable> selectByExample(MovieActorTableExample example);

    MovieActorTable selectByPrimaryKey(MovieActorTableKey key);

    int updateByExampleSelective(@Param("record") MovieActorTable record, @Param("example") MovieActorTableExample example);

    int updateByExample(@Param("record") MovieActorTable record, @Param("example") MovieActorTableExample example);

    int updateByPrimaryKeySelective(MovieActorTable record);

    int updateByPrimaryKey(MovieActorTable record);
}