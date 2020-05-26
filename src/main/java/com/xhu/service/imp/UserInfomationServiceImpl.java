package com.xhu.service.imp;

import com.xhu.mapper.CityMapper;
import com.xhu.mapper.FunMapper;
import com.xhu.mapper.UserFunMapper;
import com.xhu.mapper.UserMapper;
import com.xhu.po.*;
import com.xhu.service.CityService;
import com.xhu.service.StateLiftService;
import com.xhu.service.UserFunService;
import com.xhu.service.UserInfomationService;
import com.xhu.utils.StateCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liu li
 * @date 2020/5/26 19:05
 * 此处调用UserFunService和StateLifeService增加系统耦合性
 * 只为项目开发中节约时间的一时之局，项目结束后便改
 */
@Service
public class UserInfomationServiceImpl implements UserInfomationService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserFunService userFunService;

    @Autowired
    private StateLiftService stateLiftService;
    @Autowired
    private CityMapper cityMapper;
    @Override
    public List<Object> findUserInfomationByUserId(String userId) {

        User user = userMapper.selectByPrimaryKey(userId);
        List<Fun> funs = userFunService.findFunByUserId(user.getUserId());
        StateLife stateLife = stateLiftService.selectStateLifeByPrimartKey(user.getStateLifeId());
        String stateLifeName = null;
        if( null != stateLife ) stateLifeName = stateLife.getStateLifeName();
        String cityName = null;
        if(null != user.getCityId()) cityName = cityMapper.selectByPrimaryKey(user.getCityId()).getCityName();
        UserInfomation userInfomation = new UserInfomation(user, funs, cityName,stateLifeName);
        List<Object> list = new ArrayList<>();
        list.add(StateCode.SUCCESS);
        list.add(userInfomation);
        return list;
    }
}
