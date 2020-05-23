package com.xhu.mapper;

import com.xhu.po.FieldSeat;
import com.xhu.po.FieldSeatExample;
import com.xhu.po.FieldSeatKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FieldSeatMapper {
    long countByExample(FieldSeatExample example);

    int deleteByExample(FieldSeatExample example);

    int deleteByPrimaryKey(FieldSeatKey key);

    int insert(FieldSeat record);

    int insertSelective(FieldSeat record);

    List<FieldSeat> selectByExample(FieldSeatExample example);

    FieldSeat selectByPrimaryKey(FieldSeatKey key);

    int updateByExampleSelective(@Param("record") FieldSeat record, @Param("example") FieldSeatExample example);

    int updateByExample(@Param("record") FieldSeat record, @Param("example") FieldSeatExample example);

    int updateByPrimaryKeySelective(FieldSeat record);

    int updateByPrimaryKey(FieldSeat record);
}