package com.xhu.mapper;

import com.xhu.po.OrderPreferentialExample;
import com.xhu.po.OrderPreferentialKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderPreferentialMapper {
    long countByExample(OrderPreferentialExample example);

    int deleteByExample(OrderPreferentialExample example);

    int deleteByPrimaryKey(OrderPreferentialKey key);

    int insert(OrderPreferentialKey record);

    int insertSelective(OrderPreferentialKey record);

    List<OrderPreferentialKey> selectByExample(OrderPreferentialExample example);

    int updateByExampleSelective(@Param("record") OrderPreferentialKey record, @Param("example") OrderPreferentialExample example);

    int updateByExample(@Param("record") OrderPreferentialKey record, @Param("example") OrderPreferentialExample example);
}