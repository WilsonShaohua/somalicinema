package com.xhu.mapper;

import com.xhu.po.ActorOccupationalExample;
import com.xhu.po.ActorOccupationalKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActorOccupationalMapper {
    long countByExample(ActorOccupationalExample example);

    int deleteByExample(ActorOccupationalExample example);

    int deleteByPrimaryKey(ActorOccupationalKey key);

    int insert(ActorOccupationalKey record);

    int insertSelective(ActorOccupationalKey record);

    List<ActorOccupationalKey> selectByExample(ActorOccupationalExample example);

    int updateByExampleSelective(@Param("record") ActorOccupationalKey record, @Param("example") ActorOccupationalExample example);

    int updateByExample(@Param("record") ActorOccupationalKey record, @Param("example") ActorOccupationalExample example);
}