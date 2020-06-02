package com.xhu.mapper;

import com.xhu.po.ScreeningRoom;
import com.xhu.po.ScreeningRoomExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ScreeningRoomMapper {
    long countByExample(ScreeningRoomExample example);

    int deleteByExample(ScreeningRoomExample example);

    int deleteByPrimaryKey(String screeningRoomId);

    int insert(ScreeningRoom record);

    int insertSelective(ScreeningRoom record);

    List<ScreeningRoom> selectByExample(ScreeningRoomExample example);

    ScreeningRoom selectByPrimaryKey(String screeningRoomId);

    int updateByExampleSelective(@Param("record") ScreeningRoom record, @Param("example") ScreeningRoomExample example);

    int updateByExample(@Param("record") ScreeningRoom record, @Param("example") ScreeningRoomExample example);

    int updateByPrimaryKeySelective(ScreeningRoom record);

    int updateByPrimaryKey(ScreeningRoom record);
}