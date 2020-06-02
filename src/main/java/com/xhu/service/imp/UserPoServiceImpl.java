package com.xhu.service.imp;

import com.xhu.mapper.*;
import com.xhu.po.*;
import com.xhu.service.UserPoService;
import org.apache.commons.codec.digest.DigestUtils;
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
public class UserPoServiceImpl implements UserPoService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private FunMapper funMapper;
    @Autowired
    private UserFunMapper userFunMapper;
    @Autowired
    private StateLifeMapper stateLifeMapper;
    @Autowired
    private CityMapper cityMapper;

    @Override
    public UserPo findUserInfomationByUserId(String userId) {
        //用户
        User user = userMapper.selectByPrimaryKey(userId);
        if (null == user)
            return null;
        //用户兴趣
        UserFunExample userFunExample = new UserFunExample();
        UserFunExample.Criteria userFunExampleCriteria = userFunExample.createCriteria();
        userFunExampleCriteria.andUserIdEqualTo(userId);
        List<UserFun> userFuns = userFunMapper.selectByExample(userFunExample);
        //迭代获取funIds
        List<String> funIds = new ArrayList<>();
        funIds.clear();
        for (UserFun userFun : userFuns) {
            funIds.add(userFun.getFunId());
        }
        //兴趣
        List<Fun> funs = null;
        FunExample funExample = new FunExample();
        if (null != funIds && funIds.size() != 0) {
            FunExample.Criteria funCriteria = funExample.createCriteria();
            funCriteria.andFunIdIn(funIds);
            funs = funMapper.selectByExample(funExample);
        }


        //生活状态
        String stateLifeName = null;
        if (null != user.getStateLifeId()) {
            StateLife stateLife = stateLifeMapper.selectByPrimaryKey(user.getStateLifeId());
            stateLifeName = stateLife.getStateLifeName();
        }

        //城市名
        String cityName = null;
        if (null != user.getCityId()) {
            City city = cityMapper.selectByPrimaryKey(user.getCityId());
            cityName = city.getCityName();
        }
        //创建UserInfomation
        UserPo userPo = new UserPo(user, funs, cityName, stateLifeName);
        //返回userInfomation
        return userPo;
    }

    @Override
    public UserPo findUserInfomationByUserTelphoneAndUserPasswprd(String userTelphone, String userPasword) {
        //创建Example
        UserExample userExample = new UserExample();
        UserExample.Criteria userCriteria = userExample.createCriteria();
        //将telphone和password加入查找条件
        userCriteria.andUserTelphoneEqualTo(userTelphone);
        //将密码MD5加密
        String Md5Password = DigestUtils.md5Hex(userPasword);
        userCriteria.andUserPasswordEqualTo(Md5Password);
        //查询用户
        List<User> users = userMapper.selectByExample(userExample);
        //查询用为空或返回数据不为一条返回null
        if (null == users || users.size() != 1) {
            return null;
        }
        //获取用户
        User user = users.get(0);
        //获取用户id
        String userId = user.getUserId();
        //查找用户id返回用户信息
        return findUserInfomationByUserId(userId);
    }
}
