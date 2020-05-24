package com.xhu.controller;

import com.alibaba.fastjson.JSONObject;
import com.xhu.po.User;
import com.xhu.service.UserService;
import com.xhu.utils.StateCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import static com.xhu.utils.JSOTUtils.packageeJson;

/**
 * @author liu li
 * @date 2020/5/24 17:14
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;



    @RequestMapping(value = "/login")
    public JSONObject login(String userTelphone, String userPassword) {
        User user = new User();
        user.setUserPassword(userPassword);
        user.setUserTelphone(userTelphone);
        int returnCode = userService.userLogin(user);
        //获取查询到的USer对象
        Map<Integer, User> findUserMap = userService.selectUserByTelphone(user.getUserTelphone());
        Iterator iterator = findUserMap.entrySet().iterator();
        Map.Entry<Integer, User> entry = (Map.Entry<Integer, User>) iterator.next();
        int findCode = entry.getKey();
        User findUser = entry.getValue();
        JSONObject res = null;
        //返回码未成功或返回码与查找码相同则返回返回码信息否则返回查找码信息
        if (returnCode != StateCode.SUCCESS || returnCode == findCode) {
            res = packageeJson(returnCode, StateCode.MSG.get(returnCode), user);
        } else {
            res = packageeJson(findCode, StateCode.MSG.get(findCode), null);
        }
        return res;

    }

    @RequestMapping(value = "/register")
    public void register(String userTelphone, String userPassword) {
        User user = new User();
        user.setUserTelphone(userTelphone);
        user.setUserPassword(userPassword);
        int returnCode = userService.userRegist(user);
    }

}
