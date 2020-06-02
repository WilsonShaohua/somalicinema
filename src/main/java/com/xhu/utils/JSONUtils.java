package com.xhu.utils;

import com.alibaba.fastjson.JSONObject;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liu li
 * @date 2020/5/24 21:43
 */
public class JSONUtils {
    public static JSONObject packageJson(int code, String msg, Object data) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", code);
        jsonObject.put("msg", msg);
        jsonObject.put("data", data);
        return jsonObject;
    }

    public static JSONObject getRequestJsonObject(HttpServletRequest request) throws IOException {
        String json = getRequestJsonString(request);
        return JSONObject.parseObject(json);
    }

    public static String getRequestJsonString(HttpServletRequest request)
            throws IOException {
        String submitMehtod = request.getMethod();
        // GET
        if (submitMehtod.equals("GET")) {
            return new String(request.getQueryString().getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8).replaceAll("%22", "\"");
            // POST
        } else {
            return getRequestPostStr(request);
        }
    }

    public static byte[] getRequestPostBytes(HttpServletRequest request)
            throws IOException {
        int contentLength = request.getContentLength();
        if (contentLength < 0) {
            return null;
        }
        byte[] buffer = new byte[contentLength];
        for (int i = 0; i < contentLength; ) {

            int readlen = request.getInputStream().read(buffer, i,
                    contentLength - i);
            if (readlen == -1) {
                break;
            }
            i += readlen;
        }
        return buffer;
    }


    public static String getRequestPostStr(HttpServletRequest request) throws IOException {
        byte[] buffer = getRequestPostBytes(request);
        String charEncoding = request.getCharacterEncoding();
        if (charEncoding == null) {
            charEncoding = "UTF-8";
        }
        return new String(buffer, charEncoding);
    }

    public static List<Object> MovieCodeAndLimit(HttpServletRequest request) throws IOException {
        //String jsonString = JSONUtils.getRequestJsonString(request);
        JSONObject jsonObject = JSONUtils.getRequestJsonObject(request);
        List<Object> codeAndLimit = new ArrayList<>();
        Integer code = jsonObject.getInteger("code");
        codeAndLimit.add(code);
        Map<String, Object> stringObjectMap = new HashMap<>();
        Integer limit = jsonObject.getInteger("limit");
        if (limit != null)
            stringObjectMap.put("limit", limit);
        String movieTypeId = jsonObject.getString("movieTypeId");
        if (null != movieTypeId)
            stringObjectMap.put("movieTypeId", movieTypeId);
        String regionalId = jsonObject.getString("regionalId");
        if (null != regionalId)
            stringObjectMap.put("regionalId", regionalId);
        codeAndLimit.add(stringObjectMap);
        return codeAndLimit;
    }

}
