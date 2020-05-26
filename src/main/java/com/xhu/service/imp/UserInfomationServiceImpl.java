package com.xhu.service.imp;

import com.xhu.mapper.FunMapper;
import com.xhu.mapper.UserFunMapper;
import com.xhu.mapper.UserMapper;
import com.xhu.po.Fun;
import com.xhu.po.StateLife;
import com.xhu.po.User;
import com.xhu.po.UserInfomation;
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
 */
@Service
public class UserInfomationServiceImpl implements UserInfomationService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserFunService userFunService;

    @Autowired
    private StateLiftService stateLiftService;

    @Override
    public List<Object> findUserInfomationByUserId(String userId) {

        User user = userMapper.selectByPrimaryKey(userId);
        List<Fun> funs = userFunService.findFunByUserId(user.getUserId());
        StateLife stateLife = stateLiftService.selectStateLifeByPrimartKey(user.getStateLifeId());
        String stateLifeName = null;
        if( null != stateLife ) stateLifeName = stateLife.getStateLifeName();
        UserInfomation userInfomation = new UserInfomation(user, funs, null,stateLifeName);
        List<Object> list = new ArrayList<>();
        list.add(StateCode.SUCCESS);
        list.add(userInfomation);
        return list;
    }
}
