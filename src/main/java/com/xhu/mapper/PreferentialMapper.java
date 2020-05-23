package com.xhu.mapper;

import com.xhu.po.Preferential;
import com.xhu.po.PreferentialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PreferentialMapper {
    long countByExample(PreferentialExample example);

    int deleteByExample(PreferentialExample example);

    int deleteByPrimaryKey(String preferentialId);

    int insert(Preferential record);

    int insertSelective(Preferential record);

    List<Preferential> selectByExample(PreferentialExample example);

    Preferential selectByPrimaryKey(String preferentialId);

    int updateByExampleSelective(@Param("record") Preferential record, @Param("example") PreferentialExample example);

    int updateByExample(@Param("record") Preferential record, @Param("example") PreferentialExample example);

    int updateByPrimaryKeySelective(Preferential record);

    int updateByPrimaryKey(Preferential record);
}