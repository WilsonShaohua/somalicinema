package com.xhu.mapper;

import com.xhu.po.Regional;
import com.xhu.po.RegionalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegionalMapper {
    long countByExample(RegionalExample example);

    int deleteByExample(RegionalExample example);

    int insert(Regional record);

    int insertSelective(Regional record);

    List<Regional> selectByExample(RegionalExample example);

    int updateByExampleSelective(@Param("record") Regional record, @Param("example") RegionalExample example);

    int updateByExample(@Param("record") Regional record, @Param("example") RegionalExample example);
}