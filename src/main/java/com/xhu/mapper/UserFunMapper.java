package com.xhu.mapper;

import com.xhu.po.UserFun;
import com.xhu.po.UserFunExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserFunMapper {
    long countByExample(UserFunExample example);

    int deleteByExample(UserFunExample example);

    int deleteByPrimaryKey(UserFun key);

    int insert(UserFun record);

    int insertSelective(UserFun record);

    List<UserFun> selectByExample(UserFunExample example);

    int updateByExampleSelective(@Param("record") UserFun record, @Param("example") UserFunExample example);

    int updateByExample(@Param("record") UserFun record, @Param("example") UserFunExample example);
}