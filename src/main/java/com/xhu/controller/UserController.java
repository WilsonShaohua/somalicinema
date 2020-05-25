package com.xhu.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xhu.po.User;
import com.xhu.service.UserService;
import com.xhu.utils.JSONUtils;
import com.xhu.utils.StateCode;
import io.swagger.annotations.SwaggerDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.spring.web.json.Json;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import static com.xhu.utils.JSONUtils.packageeJson;

/**
 * @author liu li
 * @date 2020/5/24 17:14
 */
@SwaggerDefinition
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;



    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String jsonStr = JSONUtils.getRequestPostStr(request);
        User user = JSON.parseObject(jsonStr, User.class);
        System.out.println(user);
        int returnCode = userService.userLogin(user);
        //获取查询到的USer对象
        Map<Integer, User> findUserMap = userService.selectUserByTelphone(user.getUserTelphone());
        Iterator iterator = findUserMap.entrySet().iterator();
        int findCode = StateCode.NULL_FEILD;
        User findUser = null;
        if(iterator.hasNext()){
            Map.Entry<Integer, User> entry = (Map.Entry<Integer, User>) iterator.next();
            findCode = entry.getKey();
            findUser = entry.getValue();
        }

        JSONObject res = null;
        //返回码未成功或返回码与查找码相同则返回返回码信息否则返回查找码信息
        if (returnCode != StateCode.SUCCESS || returnCode == findCode) {
            res = packageeJson(returnCode, StateCode.MSG.get(returnCode), user);
        } else {
            res = packageeJson(findCode, StateCode.MSG.get(findCode), null);
        }
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write(res.toJSONString());
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public void register(String userTelphone, String userPassword,HttpServletResponse response) {
        User user = new User();
        user.setUserTelphone(userTelphone);
        user.setUserPassword(userPassword);
        int returnCode = userService.userRegist(user);
    }

}
