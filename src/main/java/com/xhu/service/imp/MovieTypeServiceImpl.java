package com.xhu.service.imp;

import com.xhu.mapper.MovieTypeMapper;
import com.xhu.po.MovieType;
import com.xhu.po.MovieTypeExample;
import com.xhu.service.MovieTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<MovieType> findMovieTypeByIds(List<String> movieTypeIds) {
        MovieTypeExample movieTypeExample = new MovieTypeExample();
        MovieTypeExample.Criteria criteria = movieTypeExample.createCriteria();
        criteria.andMovieTypeIdIn(movieTypeIds);
        return movieTypeMapper.selectByExample(movieTypeExample);
    }

    @Override
    public int updateMovieType(MovieType movieType) {
        return 0;
    }

    @Override
    public int insertMovieType(MovieType movieType) {
        return 0;
    }

    @Override
    public int deleteMovieType(String movieType) {
        return 0;
    }
}
