package com.xhu.mapper;

import com.xhu.po.Occupational;
import com.xhu.po.OccupationalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OccupationalMapper {
    long countByExample(OccupationalExample example);

    int deleteByExample(OccupationalExample example);

    int deleteByPrimaryKey(String occupationalId);

    int insert(Occupational record);

    int insertSelective(Occupational record);

    List<Occupational> selectByExample(OccupationalExample example);

    Occupational selectByPrimaryKey(String occupationalId);

    int updateByExampleSelective(@Param("record") Occupational record, @Param("example") OccupationalExample example);

    int updateByExample(@Param("record") Occupational record, @Param("example") OccupationalExample example);

    int updateByPrimaryKeySelective(Occupational record);

    int updateByPrimaryKey(Occupational record);
}