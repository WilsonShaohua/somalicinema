package com.xhu.service.imp;

import com.xhu.mapper.UserMapper;
import com.xhu.po.User;
import com.xhu.po.UserExample;
import com.xhu.service.UserService;
import com.xhu.utils.KeyProductor;
import com.xhu.utils.StateCode;
import io.swagger.models.auth.In;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liu li
 * @date 2020/5/24 17:18
 */
@Service
public class UserServiceImp implements UserService {
    private UserExample userExample = null;
    private UserExample.Criteria criteria = null;
    @Autowired
    private UserMapper userMapper;

    //用户登录模块
    @Override
    public int userLogin(User user) {
        //字段为空，返回错误码204
        if (null == user.getUserPassword() || null == user.getUserTelphone()) {
            return StateCode.NULL_FEILD;
        }
        //实例化example对象
        userExample = new UserExample();
        //获取criter对象
        criteria = userExample.createCriteria();

        criteria.andUserTelphoneEqualTo(user.getUserTelphone());
        //系统查找该telphone是否注册
        boolean is_regist = StateCode.ONE_INSTANCE == userMapper.countByExample(userExample);
        //未注册特telphone
        if (is_regist == false) {
            return StateCode.UNREGIST;
        }
        //password数据md5码
        String pwdMd5 = DigestUtils.md5Hex(user.getUserPassword());
        //pwdMd5与密码相比较
        criteria.andUserPasswordEqualTo(pwdMd5);

        long count = userMapper.countByExample(userExample);
        if (StateCode.ONE_INSTANCE == count) return StateCode.SUCCESS; //查找到电话、密码都正确的数量为1
        else return StateCode.FAIL;
    }

    //用户注册
    @Override
    public int userRegist(User user) {

        if (null == user.getUserPassword() || null == user.getUserTelphone()) {
            return StateCode.NULL_FEILD;
        }
        userExample = new UserExample();
        criteria = userExample.createCriteria();
        criteria.andUserTelphoneEqualTo(user.getUserTelphone());
        long count = userMapper.countByExample(userExample);

        if (count > 0) {
            return StateCode.USED;
        }
        userExample.clear();
        String pwdMd5 = DigestUtils.md5Hex(user.getUserPassword());
        user.setUserPassword(pwdMd5);
        String userId = KeyProductor.getKey();
        user.setUserId(userId);
        userMapper.insertSelective(user);
        return StateCode.SUCCESS;
    }

    @Override
    public Map<Integer,User> selectUserByTelphone(String telphone) {
        Map<Integer,User> res = new HashMap<>();
        if(null == telphone || telphone.length() == 0){
            res.put(StateCode.NULL_FEILD, null);
            return res;
        }
        userExample = new UserExample();
        criteria = userExample.createCriteria();
        criteria.andUserTelphoneEqualTo(telphone);
        List<User> users = userMapper.selectByExample(userExample);
        if(null == users || users.size() == StateCode.NULL_FEILD){
            res.put(StateCode.NOT_FOUND, null); //用户不存在
        }else if(users.size() > StateCode.ONE_INSTANCE){
            res.put(StateCode.MULTI_INSTANCE, null); //用户注册过多
        }else {
            res.put(StateCode.SUCCESS, users.get(0)); //找到该用户
        }
        return res;
    }


}
