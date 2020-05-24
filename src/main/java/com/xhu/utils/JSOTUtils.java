package com.xhu.utils;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liu li
 * @date 2020/5/24 21:43
 */
public class JSOTUtils {
    public static JSONObject packageeJson(int code, String msg, Object data) {
        Map<String, Object> requestMap = new HashMap<>();
        requestMap.put("code", code);
        requestMap.put("msg", msg);
        requestMap.put("data", data);
        return new JSONObject(requestMap);
    }
}
