package com.xhu.mapper;

import com.xhu.po.AreaAddress;
import com.xhu.po.AreaAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AreaAddressMapper {
    long countByExample(AreaAddressExample example);

    int deleteByExample(AreaAddressExample example);

    int deleteByPrimaryKey(String areaAddressId);

    int insert(AreaAddress record);

    int insertSelective(AreaAddress record);

    List<AreaAddress> selectByExample(AreaAddressExample example);

    AreaAddress selectByPrimaryKey(String areaAddressId);

    int updateByExampleSelective(@Param("record") AreaAddress record, @Param("example") AreaAddressExample example);

    int updateByExample(@Param("record") AreaAddress record, @Param("example") AreaAddressExample example);

    int updateByPrimaryKeySelective(AreaAddress record);

    int updateByPrimaryKey(AreaAddress record);
}