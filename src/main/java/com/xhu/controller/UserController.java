package com.xhu.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xhu.po.User;
import com.xhu.service.UserService;
import com.xhu.utils.JSONUtils;
import com.xhu.utils.StateCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.spring.web.json.Json;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import static com.xhu.utils.JSONUtils.packageJson;

/**
 * @author liu li
 * @date 2020/5/24 17:14
 */
@SwaggerDefinition
@Controller
@RequestMapping(value = "/user")
@Api(value = "用户Controller", tags = "用户操作接口")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 用户登录接口
     * @param request
     * @param response
     * @throws IOException
     * 接受localhost：8080、9000、9977端口访问
     */
    @CrossOrigin(origins = {"http://localhost:8080","http://localhost:9000","http://localhost:9977"})
    @ApiOperation(value = "用户登录接口")
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
            res = packageJson(returnCode, StateCode.MSG.get(returnCode), findUser);
        } else {
            res = packageJson(findCode, StateCode.MSG.get(findCode), null);
        }
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write(res.toJSONString());
    }

    /**
     * 注册接口
     *
     * @param request
     * @param response
     * @throws IOException
     */
    @ApiOperation(value = "用户注册")
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
