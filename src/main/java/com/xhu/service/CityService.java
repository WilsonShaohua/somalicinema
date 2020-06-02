package com.xhu.service;

import com.xhu.po.City;

import java.util.List;

/**
 * @author liu li
 * @date 2020/5/25 10:34
 */
public interface CityService {
    City selectCityByName(String cityName);

    List<City> selectCitiesByProvinceId(String provinceId);

    City selectCityByCityId(String cityId);


}
