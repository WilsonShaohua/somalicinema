package com.xhu.mapper;

import com.xhu.po.Watched;
import com.xhu.po.WatchedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WatchedMapper {
    long countByExample(WatchedExample example);

    int deleteByExample(WatchedExample example);

    int deleteByPrimaryKey(String watchedId);

    int insert(Watched record);

    int insertSelective(Watched record);

    List<Watched> selectByExample(WatchedExample example);

    Watched selectByPrimaryKey(String watchedId);

    int updateByExampleSelective(@Param("record") Watched record, @Param("example") WatchedExample example);

    int updateByExample(@Param("record") Watched record, @Param("example") WatchedExample example);

    int updateByPrimaryKeySelective(Watched record);

    int updateByPrimaryKey(Watched record);
}