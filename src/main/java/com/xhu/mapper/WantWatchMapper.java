package com.xhu.mapper;

import com.xhu.po.WantWatch;
import com.xhu.po.WantWatchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WantWatchMapper {
    long countByExample(WantWatchExample example);

    int deleteByExample(WantWatchExample example);

    int deleteByPrimaryKey(String wantWatchId);

    int insert(WantWatch record);

    int insertSelective(WantWatch record);

    List<WantWatch> selectByExample(WantWatchExample example);

    WantWatch selectByPrimaryKey(String wantWatchId);

    int updateByExampleSelective(@Param("record") WantWatch record, @Param("example") WantWatchExample example);

    int updateByExample(@Param("record") WantWatch record, @Param("example") WantWatchExample example);

    int updateByPrimaryKeySelective(WantWatch record);

    int updateByPrimaryKey(WantWatch record);
}