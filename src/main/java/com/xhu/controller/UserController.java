package com.xhu.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xhu.po.User;
import com.xhu.service.UserService;
import com.xhu.utils.JSONUtils;
import com.xhu.utils.StateCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/**
 * @author liu li
 * @date 2020/5/24 17:14
 */
@Api
@CrossOrigin
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;


    @ApiOperation(value = "登录服务",notes = "获取用户注册telephone和password")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userTelphone", value = "用户电话", dataType = "String", required = true, example = "13890777435"),
            @ApiImplicitParam(name = "userPassword", value = "用户密码", dataType = "String", required = true, example = "123456")
    })
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String jsonStr = JSONUtils.getRequestPostStr(request);
        User user = JSON.parseObject(jsonStr, User.class);
        System.out.println(user);
        int returnCode = userService.userLogin(user);
        //获取查询到的USer对象
        Map<Integer, User> findUserMap = userService.selectUserByTelphone(user.getUserTelphone());
        //将返回码初值定义为NULL_FEILD
        int findCode = StateCode.NULL_FEILD;
        //返回用户信息
        User findUser = null;
        /**
         *将查询到的Map对象数据进行解析，获取返回码和返回Uer对象
         */
        Iterator iterator = findUserMap.entrySet().iterator();
        if(iterator.hasNext()){
            Map.Entry<Integer, User> entry = (Map.Entry<Integer, User>) iterator.next();
            findCode = entry.getKey();
            findUser = entry.getValue();
        }

        JSONObject res = null;
        //返回码未成功或返回码与查找码相同则返回返回码信息否则返回查找码信息
        if (returnCode != StateCode.SUCCESS || returnCode == findCode) {
            res = JSONUtils.packageJson(returnCode, StateCode.MSG.get(returnCode), findUser);
        } else {
            res = JSONUtils.packageJson(findCode, StateCode.MSG.get(findCode), null);
        }
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write(res.toJSONString());
    }
    @ApiOperation(value = "注册服务",notes = "获取用户注册telephone和password")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userTelphone", value = "用户电话", dataType = "String", required = true, example = "13890777435"),
            @ApiImplicitParam(name = "userPassword", value = "用户密码", dataType = "String", required = true, example = "123456")
    })
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public void register(HttpServletRequest request,HttpServletResponse response) throws IOException {
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
        //将json数据存入response
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write(responseString);
    }

}
