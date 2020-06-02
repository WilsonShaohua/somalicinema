package com.xhu.mapper;

import com.xhu.po.Years;
import com.xhu.po.YearsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface YearsMapper {
    long countByExample(YearsExample example);

    int deleteByExample(YearsExample example);

    int deleteByPrimaryKey(String yearsId);

    int insert(Years record);

    int insertSelective(Years record);

    List<Years> selectByExample(YearsExample example);

    Years selectByPrimaryKey(String yearsId);

    int updateByExampleSelective(@Param("record") Years record, @Param("example") YearsExample example);

    int updateByExample(@Param("record") Years record, @Param("example") YearsExample example);

    int updateByPrimaryKeySelective(Years record);

    int updateByPrimaryKey(Years record);
}