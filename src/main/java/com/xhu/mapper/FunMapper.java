package com.xhu.mapper;

import com.xhu.po.Fun;
import com.xhu.po.FunExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FunMapper {
    long countByExample(FunExample example);

    int deleteByExample(FunExample example);

    int deleteByPrimaryKey(String funId);

    int insert(Fun record);

    int insertSelective(Fun record);

    List<Fun> selectByExample(FunExample example);

    Fun selectByPrimaryKey(String funId);

    int updateByExampleSelective(@Param("record") Fun record, @Param("example") FunExample example);

    int updateByExample(@Param("record") Fun record, @Param("example") FunExample example);

    int updateByPrimaryKeySelective(Fun record);

    int updateByPrimaryKey(Fun record);
}