package com.xhu.mapper;

import com.xhu.po.Chau;
import com.xhu.po.ChauExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ChauMapper {
    long countByExample(ChauExample example);

    int deleteByExample(ChauExample example);

    int deleteByPrimaryKey(String chauId);

    int insert(Chau record);

    int insertSelective(Chau record);

    List<Chau> selectByExample(ChauExample example);

    Chau selectByPrimaryKey(String chauId);

    int updateByExampleSelective(@Param("record") Chau record, @Param("example") ChauExample example);

    int updateByExample(@Param("record") Chau record, @Param("example") ChauExample example);

    int updateByPrimaryKeySelective(Chau record);

    int updateByPrimaryKey(Chau record);
}