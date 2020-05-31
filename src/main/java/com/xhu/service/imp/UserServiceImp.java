package com.xhu.service.imp;

import com.xhu.mapper.UserMapper;
import com.xhu.po.User;
import com.xhu.po.UserExample;
import com.xhu.service.UserService;
import com.xhu.utils.DateUtil;
import com.xhu.utils.KeyProductor;
import com.xhu.utils.constant.StateCode;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author liu li
 * @date 2020/5/24 17:18
 */
@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserMapper userMapper;

    //用户登录模块
    @Override
    public int userLogin(User user) {
        //字段为空，返回错误码204
        if (null == user || null == user.getUserPassword() || null == user.getUserTelphone()) {
            return StateCode.NULL_FEILD;
        }
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        //系统查找该telphone是否注册
        criteria.andUserTelphoneEqualTo(user.getUserTelphone());
        long res = userMapper.countByExample(userExample);
        //未注册的telphone
        if (res == 0) {
            return StateCode.UNREGIST;
        } else if (res > 1) {
            return StateCode.MULTI_INSTANCE;
        }
        //password数据md5码
        String pwdMd5 = DigestUtils.md5Hex(user.getUserPassword());
        //pwdMd5与密码相比较
        criteria.andUserPasswordEqualTo(pwdMd5);
        long count = userMapper.countByExample(userExample);
        //密码错误
        if(StateCode.NULL_FEILD == count) return StateCode.ERROR_PASSWORD;
        //查找到电话、密码都正确的数量为一个实例
        if (StateCode.ONE_INSTANCE == count){
            //更新登录时间
            Date loadTime = DateUtil.getCurrentTime();
            User user1 = new User();
            user1.setUserLastLoadTime(loadTime);
            user1.setUserIsLoad(true);
            userMapper.updateByExampleSelective(user1, userExample);
            return StateCode.SUCCESS;
        }
        else return StateCode.FAIL;
    }

    //用户注册
    @Override
    public int userRegist(User user) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        //用户电话或密码位空，返回空状态码
        if (null == user.getUserPassword() || null == user.getUserTelphone()) {
            return StateCode.NULL_FEILD;
        }
        //检查电话号码是否已经注册
        criteria.andUserTelphoneEqualTo(user.getUserTelphone());
        //查找注册数据条数
        long count = userMapper.countByExample(userExample);
        //注册数据条数大于0，返回状态USED
        if (count > 0) {
            return StateCode.USED;
        }
        //请理example
        userExample.clear();
        //使用MD5加密密码
        String pwdMd5 = DigestUtils.md5Hex(user.getUserPassword());
        //将md5加密后的密码传入user对象
        user.setUserPassword(pwdMd5);
        //使用随机数产生用户id
        String userId = KeyProductor.getKey();
        user.setUserId(userId);
        //获取系统当前时间座位数据创建时间
        Date createTime = DateUtil.getCurrentTime();
        user.setUserCreateTime(createTime);
        //默认删除为delete
        user.setUserIsDelete(false);
        //数据库加入数据,并获取添加信息
        int code = userMapper.insertSelective(user);

        //添加信息为1 返回成功状态码，否则返回失败状态码
        if (code == 1) return StateCode.SUCCESS;
        else return StateCode.FAIL;
    }

    /**
     * 通过用户电话号码查找改用户
     *
     * @param telphone
     * @return
     */
    @Override
    public User selectUserByTelphone(String telphone) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        //传入电话号码为空或电话号码长度为0，返回Null
        if(null == telphone || telphone.length() == 0) {
            return null;
        }
        //查询电话号码是否已经注册
        criteria.andUserTelphoneEqualTo(telphone);
        //查询改电话注册的用户
        List<User> users = userMapper.selectByExample(userExample);
        //用户列表为空、或用户列表长度为0
        if (null == users || users.size() == 0) {
            return null;
        } else if (users.size() == 1) { //用户长度刚好为1
            return users.get(0);
        }
        //其它内容
        return null;
    }

    @Override
    public User selectUserByPrimaryKey(String userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    /**
     * 通过用户主键升级改用户
     * @param user
     * @return
     */
    @Override
    public int updteUserByPrimaryKey(User user) {
        int res = userMapper.updateByPrimaryKeySelective(user);
        if(res ==  1) return StateCode.SUCCESS;
        return StateCode.FAIL;
    }

    @Override
    public boolean checkPassword(String userId, String userPassword) {
        UserExample userExample = new UserExample();
        UserExample.Criteria userCriteria = userExample.createCriteria();
        userCriteria.andUserIdEqualTo(userId);
        userCriteria.andUserPasswordEqualTo(userPassword);
        long count = userMapper.countByExample(userExample);
        return count == 1;
    }


}
