package com.xhu.service.imp;

import com.xhu.mapper.CityMapper;
import com.xhu.po.City;
import com.xhu.po.CityExample;
import com.xhu.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liu li
 * @date 2020/5/25 10:36
 */
@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityMapper cityMapper;
    @Override
    public City selectCityByName(String cityName) {
        CityExample cityExample = new CityExample();
        CityExample.Criteria criteria = cityExample.createCriteria();
        criteria.andCityNameEqualTo(cityName);
        List<City> cities = cityMapper.selectByExample(cityExample);
        return cities.get(0);
    }

    @Override
    public List<City> selectCitiesByProvinceId(String provinceId) {
        CityExample cityExample = new CityExample();
        CityExample.Criteria criteria = cityExample.createCriteria();
        criteria.andProvinceIdEqualTo(provinceId);
        List<City> cities = cityMapper.selectByExample(cityExample);
        try{
            return cities;
        }catch (NullPointerException e){
            return null;
        }

    }

    @Override
    public City selectCityByCityId(String cityId) {
        return cityMapper.selectByPrimaryKey(cityId);
    }
}
