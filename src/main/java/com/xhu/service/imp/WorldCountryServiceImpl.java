package com.xhu.service.imp;

import com.xhu.mapper.WorldCountryMapper;
import com.xhu.po.WorldCountry;
import com.xhu.po.WorldCountryExample;
import com.xhu.service.WorldCountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liu li
 * @date 2020/6/3 15:31
 */
@Service
public class WorldCountryServiceImpl implements WorldCountryService {
    @Autowired
    private WorldCountryMapper worldCountryMapper;

    @Override
    public List<WorldCountry> selectAll() {
        List<WorldCountry> worldCountrieList = worldCountryMapper.selectByExample(new WorldCountryExample());
        return worldCountrieList;
    }
}
