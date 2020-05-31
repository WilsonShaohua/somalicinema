package com.xhu.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xhu.po.User;
import com.xhu.po.UserPo;
import com.xhu.service.UserPoService;
import com.xhu.service.UserService;
import com.xhu.utils.JSONUtils;
import com.xhu.utils.constant.StateCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserPoService userPoService;

    @ApiOperation(value = "登录服务", notes = "获取用户注册telephone和password")
    @ApiImplicitParam(name = "user", value = "用户信息", paramType = "User", dataType = "User", required = true, defaultValue = "{\n" +
            "        \"userPassword\": \"123456\",\n" +
            "        \"userTelphone\": \"18583361379\"\n" +
            "    }")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String jsonStr = JSONUtils.getRequestPostStr(request);
        log.info("前端获取数据：" + jsonStr);
        //将String转化为User对象
        User user = JSON.parseObject(jsonStr, User.class);

        int returnCode = userService.userLogin(user);
        log.info("返回状态码：" + returnCode);
        //登录未成功
        if (StateCode.SUCCESS != returnCode) {
            JSONObject res = JSONUtils.packageJson(returnCode, StateCode.MSG.get(returnCode), null);
            response.getWriter().write(res.toJSONString());
            return;
        }
        //获取用户信息
        UserPo userPo = userPoService.findUserInfomationByUserTelphoneAndUserPasswprd(user.getUserTelphone(), user.getUserPassword());
        int code = StateCode.NULL_FEILD;  //默认登录失败
        //用户信息不为空
        if (userPo != null)
            code = StateCode.SUCCESS; //状态码为SUCCESS
        JSONObject jsonObject = JSONUtils.packageJson(code, StateCode.MSG.get(code), userPo);
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
        log.info("前端获取的数据" + jsonStr);
        //获取User对象，将JSON字符串转化为user对象
        User user = JSON.parseObject(jsonStr, User.class);
        //注册，返回注册结果状态码
        int returnCode = userService.userRegist(user);
        log.info("注册结果码：" + returnCode);
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
