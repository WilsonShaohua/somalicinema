package com.xhu.service.imp;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.xhu.po.City;
import com.xhu.service.CityService;
import com.xhu.utils.SpringTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author liu li
 * @date 2020/5/25 10:42
 */
public class CityServiceImplTest extends SpringTest {
    @Autowired
    CityService cityService;

    @Test
    public void selectCityByName() {
        City city = cityService.selectCityByName("ÄÏ³äÊÐ");
        System.out.println(JSON.toJSON(city));
    }

    @Test
    public void selectCitiesByProvinceId() {
        List<City> cities = cityService.selectCitiesByProvinceId("510");
        System.out.println("toString");
        System.out.println(cities);
        System.out.println("JSON");
        System.out.println(JSONArray.toJSON(cities));
    }
}
