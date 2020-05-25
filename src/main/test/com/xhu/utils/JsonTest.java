package com.xhu.utils;

import com.alibaba.fastjson.JSON;
import com.xhu.po.Actor;
import org.junit.Test;

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
        actor = JSON.parseObject(actroJSON,Actor.class);
        System.out.println(actor.toString());
    }
}
