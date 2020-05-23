package com.xhu.mapper;

import com.xhu.po.StudioCard;
import com.xhu.po.StudioCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudioCardMapper {
    long countByExample(StudioCardExample example);

    int deleteByExample(StudioCardExample example);

    int deleteByPrimaryKey(String studioCardId);

    int insert(StudioCard record);

    int insertSelective(StudioCard record);

    List<StudioCard> selectByExample(StudioCardExample example);

    StudioCard selectByPrimaryKey(String studioCardId);

    int updateByExampleSelective(@Param("record") StudioCard record, @Param("example") StudioCardExample example);

    int updateByExample(@Param("record") StudioCard record, @Param("example") StudioCardExample example);

    int updateByPrimaryKeySelective(StudioCard record);

    int updateByPrimaryKey(StudioCard record);
}