package com.xhu.mapper;

import com.xhu.po.PayAccount;
import com.xhu.po.PayAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayAccountMapper {
    long countByExample(PayAccountExample example);

    int deleteByExample(PayAccountExample example);

    int deleteByPrimaryKey(String payAccountId);

    int insert(PayAccount record);

    int insertSelective(PayAccount record);

    List<PayAccount> selectByExample(PayAccountExample example);

    PayAccount selectByPrimaryKey(String payAccountId);

    int updateByExampleSelective(@Param("record") PayAccount record, @Param("example") PayAccountExample example);

    int updateByExample(@Param("record") PayAccount record, @Param("example") PayAccountExample example);

    int updateByPrimaryKeySelective(PayAccount record);

    int updateByPrimaryKey(PayAccount record);
}