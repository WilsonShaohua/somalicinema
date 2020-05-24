package com.xhu.utils;

import com.alibaba.fastjson.JSON;
import com.xhu.po.Actor;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liu li
 * @date 2020/5/23 21:28
 */
public class JsonTest {
    @Test
    public void testJson() {
        Actor actor = new Actor();
        String actroJSON = JSON.toJSONString(actor);
        System.out.println(actroJSON);
        actor = JSON.parseObject(actroJSON, Actor.class);
        System.out.println(actor.toString());
    }

    @Test
    public void testJsonMap() {
        Map<String, Object> res = new HashMap<>();
        Actor actor = new Actor();
        res.put("code", 404);
        res.put("msg", "未查找到该演员");
        res.put("data", actor);
        ;

        String json = JSON.toJSONString(res);
        System.out.println(json);
        Map ress = JSON.parseObject(json, HashMap.class);
        actor = (Actor) ress.get("data");
        System.out.println(actor);
    }
}
