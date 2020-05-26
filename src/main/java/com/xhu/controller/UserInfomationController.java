package com.xhu.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xhu.po.User;
import com.xhu.po.UserInfomation;
import com.xhu.service.CityService;
import com.xhu.service.UserFunService;
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
import java.sql.SQLException;

/**
 * @author liu li
 * @date 2020/5/26 18:51
 */
@Api
@Controller
@RequestMapping(value = "/infomation")
public class UserInfomationController {
    @Autowired
    private UserInfomationService userInfomationService;
    @Autowired
    private UserService userService;
    @Autowired
    private UserFunService userFunService;

    @ApiOperation(value = "用户信息显示", notes = "前端传入userId，返回UserInfomation")
    @ApiImplicitParam(name = "userId", value = "用户id")
    @RequestMapping(value = "/show", method = RequestMethod.POST)
    public void showInfomation(HttpServletResponse response, HttpServletRequest request) throws IOException {
        //抓取前端数据
        String jsonStr = JSONUtils.getRequestPostStr(request);
        //将前端数据护转换为User Object
        User user = JSON.parseObject(jsonStr, User.class);
        //获取UserInfomation数据
        UserInfomation userInfomation = userInfomationService.findUserInfomationByUserId(user.getUserId());
        //获取状态码，默认为NULL_FEILD
        int code = StateCode.NULL_FEILD;
        //获取数据部位空，状态码转化为SUCCESS
        if (null != userInfomation) code = StateCode.SUCCESS;
        //将返回信息封装为JSONObject对象
        JSONObject jsonObject = JSONUtils.packageJson(code, StateCode.MSG.get(code), userInfomation);
        //将数据返回前端
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write(jsonObject.toJSONString());
    }

    @ApiOperation(value = "用户信息录入", notes = "用户输入个人信息")
    @ApiImplicitParam(name = "userInfomation", value = "用户信息", paramType = "UserInfomation", dataType = "UserInfomation", required = true)
    @RequestMapping(value = "/write", method = RequestMethod.POST)
    public void writeInfomation(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //将前端数据妆化为String
        String jsonStr = JSONUtils.getRequestPostStr(request);
        //将前端获取的数据转化为UserInfomaton对象
        UserInfomation userInformation = JSON.parseObject(jsonStr, UserInfomation.class);

        //修改userfun数据
        int userFunRes = StateCode.FAIL;
        try {
            userFunRes = userFunService.addUserFunByUserIdWithFuns(userInformation.getUser().getUserId(), userInformation.getFuns());
        } catch (SQLException e) {
            e.printStackTrace();
            //sql异常
            JSONObject jsonObject = JSONUtils.packageJson(StateCode.SQL_KEY_NOT_IN_DATABASE, StateCode.MSG.get(StateCode.SQL_KEY_NOT_IN_DATABASE) + userInformation.getUser().getUserId() + " or " + userInformation.getFuns().toString(), null);
            response.getWriter().write(jsonObject.toJSONString());
            return;
        } catch (NullPointerException e) { //用户未登录
            e.printStackTrace();
            JSONObject jsonObject = JSONUtils.packageJson(StateCode.NULL_LOGIN, StateCode.MSG.get(StateCode.NULL_LOGIN), null);
            response.getWriter().write(jsonObject.toJSONString());
        }
        //修改User对象
        int userRes = userService.updteUserByPrimaryKey(userInformation.getUser());
        //用户id
        String userId = userInformation.getUser().getUserId();
        //返回json数据对象
        JSONObject res = null;
        if (userRes == StateCode.SUCCESS && userFunRes == StateCode.SUCCESS) {   //修改成功将更新后的UerInfomation对象返回前端
            //通过用户id查找用户信息
            UserInfomation userInfomation = userInfomationService.findUserInfomationByUserId(userId);
            //将数据打包成JSONObject对象
            res = JSONUtils.packageJson(StateCode.SUCCESS, StateCode.MSG.get(StateCode.SUCCESS), userInfomation);
        }//数据修改失败返回错误信息
        else res = JSONUtils.packageJson(StateCode.FAIL, StateCode.MSG.get(StateCode.FAIL), null);
        //将sjon数据返回前端
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write(res.toJSONString());
    }
}
