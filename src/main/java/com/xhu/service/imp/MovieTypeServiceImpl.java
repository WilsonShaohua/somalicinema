package com.xhu.service.imp;

import com.xhu.mapper.MovieTypeMapper;
import com.xhu.po.MovieType;
import com.xhu.po.MovieTypeExample;
import com.xhu.service.MovieTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author liu li
 * @date 2020/5/27 15:06
 */
@Service
public class MovieTypeServiceImpl implements MovieTypeService {
    @Autowired
    private MovieTypeMapper movieTypeMapper;

    @Override
    public List<MovieType> findAllMovieType() {
        MovieTypeExample movieTypeExample = new MovieTypeExample();
        return movieTypeMapper.selectByExample(movieTypeExample);
    }

    @Override
    public MovieType findMovieTypeById(String movieTypeId) {
        return movieTypeMapper.selectByPrimaryKey(movieTypeId);
    }

    @Override
    public List<MovieType> findMovieTypeByIds(List<String> movieTypeIds) {
        MovieTypeExample movieTypeExample = new MovieTypeExample();
        MovieTypeExample.Criteria criteria = movieTypeExample.createCriteria();
        criteria.andMovieTypeIdIn(movieTypeIds);
        return movieTypeMapper.selectByExample(movieTypeExample);
    }

    @Override
    public int updateMovieType(MovieType movieType) {
        return movieTypeMapper.updateByPrimaryKeySelective(movieType);
    }

    @Override
    public int insertMovieType(MovieType movieType) {
        return movieTypeMapper.insertSelective(movieType);
    }

    @Override
    public int deleteMovieType(String movieType) {
        return movieTypeMapper.deleteByPrimaryKey(movieType);
    }

    @Override
    public List<MovieType> selectAll() {
        return movieTypeMapper.selectByExample(new MovieTypeExample());

    }

    @Override
    public List<String> selectMovieTypeIdByTypeName(String typeName) {
        MovieTypeExample movieTypeExample = new MovieTypeExample();
        MovieTypeExample.Criteria criteria = movieTypeExample.createCriteria();
        criteria.andMovieTypeNameLike("%" + typeName + "%");
        List<MovieType> movieTypeList = movieTypeMapper.selectByExample(movieTypeExample);
        List<String> movieTypeIdList = new ArrayList<>();
        for (MovieType movieType : movieTypeList) {
            movieTypeIdList.add(movieType.getMovieTypeId());
        }
        return movieTypeIdList;
    }

    @Override
    public List<String> selectMovieTypeIdByTypeName(String[] typeName) {
        Set<String> movieTypeIdSet = new HashSet<>();
        for (String movieTypeName : typeName) {
            movieTypeIdSet.addAll(selectMovieTypeIdByTypeName(movieTypeName));
        }
        return new ArrayList<>(movieTypeIdSet);
    }
}
