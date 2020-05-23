package com.xhu.mapper;

import com.xhu.po.Theater;
import com.xhu.po.TheaterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TheaterMapper {
    long countByExample(TheaterExample example);

    int deleteByExample(TheaterExample example);

    int deleteByPrimaryKey(String theaterId);

    int insert(Theater record);

    int insertSelective(Theater record);

    List<Theater> selectByExample(TheaterExample example);

    Theater selectByPrimaryKey(String theaterId);

    int updateByExampleSelective(@Param("record") Theater record, @Param("example") TheaterExample example);

    int updateByExample(@Param("record") Theater record, @Param("example") TheaterExample example);

    int updateByPrimaryKeySelective(Theater record);

    int updateByPrimaryKey(Theater record);
}