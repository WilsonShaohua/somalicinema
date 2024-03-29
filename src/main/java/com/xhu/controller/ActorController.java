package com.xhu.controller;

import com.alibaba.fastjson.JSON;
import com.xhu.po.Actor;
import com.xhu.service.ActorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liu li
 * @date 2020/5/24 13:23
 */
@Api
@Controller
@RequestMapping("/actor")
public class ActorController {
    @Autowired
    private ActorService actorService;

    @ApiOperation(value = "演员详细信息", notes = "演员姓名、id、出生日期、性别、个人简介", httpMethod = "POST")
    @RequestMapping(value = "/infomation", method = RequestMethod.POST)
    public String selectActor(HttpServletResponse response, HttpServletRequest request){
        String id = request.getParameter("id");
        Actor actor = actorService.selectActorById(id);
        Map<String,Object> res = new HashMap<>();
        if(actor == null){
            res.put("code", 404);
            res.put("msg", "未查找到该演员");
            res.put("data", null);
        }else{
            res.put("code",200);
            res.put("msg", "成功找到该演员");
            res.put("data", actor);
        }
        String json = JSON.toJSONString(res);

        return json;
    }
}
