package com.xhu.mapper;

import com.xhu.po.AreaFilmReleaseExample;
import com.xhu.po.AreaFilmReleaseKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AreaFilmReleaseMapper {
    long countByExample(AreaFilmReleaseExample example);

    int deleteByExample(AreaFilmReleaseExample example);

    int deleteByPrimaryKey(AreaFilmReleaseKey key);

    int insert(AreaFilmReleaseKey record);

    int insertSelective(AreaFilmReleaseKey record);

    List<AreaFilmReleaseKey> selectByExample(AreaFilmReleaseExample example);

    int updateByExampleSelective(@Param("record") AreaFilmReleaseKey record, @Param("example") AreaFilmReleaseExample example);

    int updateByExample(@Param("record") AreaFilmReleaseKey record, @Param("example") AreaFilmReleaseExample example);
}