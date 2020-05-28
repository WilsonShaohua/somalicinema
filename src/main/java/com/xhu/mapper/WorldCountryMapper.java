package com.xhu.mapper;

import com.xhu.po.WorldCountry;
import com.xhu.po.WorldCountryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WorldCountryMapper {
    long countByExample(WorldCountryExample example);

    int deleteByExample(WorldCountryExample example);

    int deleteByPrimaryKey(String worldCountryId);

    int insert(WorldCountry record);

    int insertSelective(WorldCountry record);

    List<WorldCountry> selectByExample(WorldCountryExample example);

    WorldCountry selectByPrimaryKey(String worldCountryId);

    int updateByExampleSelective(@Param("record") WorldCountry record, @Param("example") WorldCountryExample example);

    int updateByExample(@Param("record") WorldCountry record, @Param("example") WorldCountryExample example);

    int updateByPrimaryKeySelective(WorldCountry record);

    int updateByPrimaryKey(WorldCountry record);
}