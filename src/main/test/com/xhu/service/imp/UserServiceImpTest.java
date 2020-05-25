package com.xhu.service.imp;

import com.alibaba.fastjson.JSON;
import com.xhu.po.User;
import com.xhu.service.UserService;
import com.xhu.utils.SpringTest;
import com.xhu.utils.StateCode;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author liu li
 * @date 2020/5/25 10:53
 */

public class UserServiceImpTest extends SpringTest {
    @Autowired
    private UserService userService;

    @Test
    public void userLogin() {
        User user = new User();
        user.setUserTelphone("18583361372  ");
        user.setUserPassword("123456");
        System.out.println(StateCode.MSG.get(userService.userLogin(user)));
    }

    @Test
    public void userRegist() {
        User user = new User();
        user.setUserTelphone("18583361372");
        user.setUserPassword("123456");
        int res = userService.userRegist(user);
        System.out.println(StateCode.MSG.get(res));

    }

    @Test
    public void selectUserByTelphone() {
        User user = null;
        System.out.println(JSON.toJSON(user));
    }
}
