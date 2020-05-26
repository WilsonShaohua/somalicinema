package com.xhu.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xhu.po.User;
import com.xhu.po.UserInfomation;
import com.xhu.service.UserInfomationService;
import com.xhu.service.UserService;
import com.xhu.utils.JSONUtils;
import com.xhu.utils.StateCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author liu li
 * @date 2020/5/24 17:14
 */
@Api
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserInfomationService userInfomationService;

    @ApiOperation(value = "登录服务", notes = "获取用户注册telephone和password")
    @ApiImplicitParam(name = "user", value = "用户信息", paramType = "User", dataType = "User", required = true, defaultValue = "{\n" +
            "        \"userPassword\": \"123456\",\n" +
            "        \"userTelphone\": \"18583361379\"\n" +
            "    }")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String jsonStr = JSONUtils.getRequestPostStr(request);
        //将String转化为User对象
        User user = JSON.parseObject(jsonStr, User.class);

        int returnCode = userService.userLogin(user);
        //登录未成功
        if (StateCode.SUCCESS != returnCode) {
            JSONObject res = JSONUtils.packageJson(returnCode, StateCode.MSG.get(returnCode), null);
            response.getWriter().write(res.toJSONString());
            return;
        }
        //获取用户信息
        UserInfomation userInfomation = userInfomationService.findUserInfomationByUserTelphoneAndUserPasswprd(user.getUserTelphone(), user.getUserPassword());
        int code = StateCode.NULL_FEILD;  //默认登录失败
        //用户信息不为空
        if (userInfomation != null)
            code = StateCode.SUCCESS; //状态码为SUCCESS
        JSONObject jsonObject = JSONUtils.packageJson(code, StateCode.MSG.get(code), userInfomation);
        //设置字符集
        response.setContentType("text/html;charset=utf-8");
        //传递数据
        response.getWriter().write(jsonObject.toJSONString());
    }

    @ApiOperation(value = "注册服务", notes = "获取用户注册telephone和password")
    @ApiImplicitParam(name = "user", value = "用户信息", paramType = "User", dataType = "User", required = true)
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public void register(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //将前端JSON数据转化成JSON字符串
        String jsonStr = JSONUtils.getRequestPostStr(request);
        //获取User对象，将JSON字符串转化为user对象
        User user = JSON.parseObject(jsonStr, User.class);
        //注册，返回注册结果状态码
        int returnCode = userService.userRegist(user);
        /**
         * 将状态码、返回信息、数据封装成JSONObject
         */
        JSONObject jsonObject = JSONUtils.packageJson(returnCode, StateCode.MSG.get(returnCode), user);
        //将JSONObject转化为JSON字符串
        String responseString = jsonObject.toJSONString();
        //修正数据字符集
        response.setContentType("text/html;charset=utf-8");
        //传递数据
        response.getWriter().write(responseString);
    }

}
