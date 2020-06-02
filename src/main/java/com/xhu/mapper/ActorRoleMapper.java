package com.xhu.mapper;

import com.xhu.po.ActorRole;
import com.xhu.po.ActorRoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActorRoleMapper {
    long countByExample(ActorRoleExample example);

    int deleteByExample(ActorRoleExample example);

    int deleteByPrimaryKey(String actorRoleId);

    int insert(ActorRole record);

    int insertSelective(ActorRole record);

    List<ActorRole> selectByExample(ActorRoleExample example);

    ActorRole selectByPrimaryKey(String actorRoleId);

    int updateByExampleSelective(@Param("record") ActorRole record, @Param("example") ActorRoleExample example);

    int updateByExample(@Param("record") ActorRole record, @Param("example") ActorRoleExample example);

    int updateByPrimaryKeySelective(ActorRole record);

    int updateByPrimaryKey(ActorRole record);
}