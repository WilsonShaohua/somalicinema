package com.xhu.mapper;

import com.xhu.po.UserStudioCardExample;
import com.xhu.po.UserStudioCardKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserStudioCardMapper {
    long countByExample(UserStudioCardExample example);

    int deleteByExample(UserStudioCardExample example);

    int deleteByPrimaryKey(UserStudioCardKey key);

    int insert(UserStudioCardKey record);

    int insertSelective(UserStudioCardKey record);

    List<UserStudioCardKey> selectByExample(UserStudioCardExample example);

    int updateByExampleSelective(@Param("record") UserStudioCardKey record, @Param("example") UserStudioCardExample example);

    int updateByExample(@Param("record") UserStudioCardKey record, @Param("example") UserStudioCardExample example);
}