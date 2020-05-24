package com.xhu.mapper;

import com.xhu.po.UserFunExample;
import com.xhu.po.UserFunKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserFunMapper {
    long countByExample(UserFunExample example);

    int deleteByExample(UserFunExample example);

    int deleteByPrimaryKey(UserFunKey key);

    int insert(UserFunKey record);

    int insertSelective(UserFunKey record);

    List<UserFunKey> selectByExample(UserFunExample example);

    int updateByExampleSelective(@Param("record") UserFunKey record, @Param("example") UserFunExample example);

    int updateByExample(@Param("record") UserFunKey record, @Param("example") UserFunExample example);
}