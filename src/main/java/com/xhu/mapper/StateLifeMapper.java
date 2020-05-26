package com.xhu.mapper;

import com.xhu.po.StateLife;
import com.xhu.po.StateLifeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StateLifeMapper {
    long countByExample(StateLifeExample example);

    int deleteByExample(StateLifeExample example);

    int deleteByPrimaryKey(String stateLifeId);

    int insert(StateLife record);

    int insertSelective(StateLife record);

    List<StateLife> selectByExample(StateLifeExample example);

    StateLife selectByPrimaryKey(String stateLifeId);

    int updateByExampleSelective(@Param("record") StateLife record, @Param("example") StateLifeExample example);

    int updateByExample(@Param("record") StateLife record, @Param("example") StateLifeExample example);

    int updateByPrimaryKeySelective(StateLife record);

    int updateByPrimaryKey(StateLife record);
}