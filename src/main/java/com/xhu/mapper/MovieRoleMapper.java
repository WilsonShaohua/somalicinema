package com.xhu.mapper;

import com.xhu.po.MovieRole;
import com.xhu.po.MovieRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MovieRoleMapper {
    long countByExample(MovieRoleExample example);

    int deleteByExample(MovieRoleExample example);

    int deleteByPrimaryKey(String movieRoleId);

    int insert(MovieRole record);

    int insertSelective(MovieRole record);

    List<MovieRole> selectByExample(MovieRoleExample example);

    MovieRole selectByPrimaryKey(String movieRoleId);

    int updateByExampleSelective(@Param("record") MovieRole record, @Param("example") MovieRoleExample example);

    int updateByExample(@Param("record") MovieRole record, @Param("example") MovieRoleExample example);

    int updateByPrimaryKeySelective(MovieRole record);

    int updateByPrimaryKey(MovieRole record);
}