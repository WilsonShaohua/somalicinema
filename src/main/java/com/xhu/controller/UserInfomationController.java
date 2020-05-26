package com.xhu.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xhu.po.User;
import com.xhu.po.UserInfomation;
import com.xhu.service.UserInfomationService;
import com.xhu.utils.JSONUtils;
import com.xhu.utils.StateCode;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author liu li
 * @date 2020/5/26 18:51
 */
@Api
@Controller
@RequestMapping(value = "/userInfomation")
public class UserInfomationController {
    @Autowired
    private UserInfomationService userInfomationService;

    @RequestMapping(value = "/show",method = RequestMethod.POST)
    public void showInfomation(HttpServletResponse response, HttpServletRequest request) throws IOException {
        String jsonStr = JSONUtils.getRequestPostStr(request);
        User user = JSON.parseObject(jsonStr,User.class);
        List<Object> res = userInfomationService.findUserInfomationByUserId(user.getUserId());
        int code = (int) res.get(0);
        UserInfomation userInfomation = (UserInfomation) res.get(1);
        JSONObject jsonObject = JSONUtils.packageJson(code,StateCode.MSG.get(code),userInfomation );
        response.getWriter().write(jsonObject.toJSONString());
    }

}
