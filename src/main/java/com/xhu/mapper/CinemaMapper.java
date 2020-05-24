package com.xhu.mapper;

import com.xhu.po.Cinema;
import com.xhu.po.CinemaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CinemaMapper {
    long countByExample(CinemaExample example);

    int deleteByExample(CinemaExample example);

    int deleteByPrimaryKey(String cinemaId);

    int insert(Cinema record);

    int insertSelective(Cinema record);

    List<Cinema> selectByExample(CinemaExample example);

    Cinema selectByPrimaryKey(String cinemaId);

    int updateByExampleSelective(@Param("record") Cinema record, @Param("example") CinemaExample example);

    int updateByExample(@Param("record") Cinema record, @Param("example") CinemaExample example);

    int updateByPrimaryKeySelective(Cinema record);

    int updateByPrimaryKey(Cinema record);
}