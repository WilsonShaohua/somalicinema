package com.xhu.mapper;

import com.xhu.po.Regional;
import com.xhu.po.RegionalExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RegionalMapper {
    long countByExample(RegionalExample example);

    int deleteByExample(RegionalExample example);

    int deleteByPrimaryKey(String regionalId);

    int insert(Regional record);

    int insertSelective(Regional record);

    List<Regional> selectByExample(RegionalExample example);

    Regional selectByPrimaryKey(String regionalId);

    int updateByExampleSelective(@Param("record") Regional record, @Param("example") RegionalExample example);

    int updateByExample(@Param("record") Regional record, @Param("example") RegionalExample example);

    int updateByPrimaryKeySelective(Regional record);

    int updateByPrimaryKey(Regional record);
}