package com.xhu.utils;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

/**
 * tomcat 1
 * maven
 * Lombok
 * swagger2
 * spring spring-mvc mybatis
 * idea
 *
 * @author liu li
 * @date 2020/5/24 21:04
 * 本接口定义消息返回状态码code
 */
public interface StateCode {
    int SUCCESS = 200; //成功
    int FAIL = 400; //失败
    int NOT_FOUND=404; //未找到
    int MULTI_INSTANCE = 405; //多个实例
    int ONE_INSTANCE = 1; //存在一个实例
    int USED = 406; //已经使用
    int UNREGIST = 206; //未注册
    int NULL_FEILD = 0; //NULL值
    int ERROR_PASSWORD = 401; //密码错误
    int SQL_KEY_NOT_IN_DATABASE = 1433; //数据库无该键值
    int NULL_LOGIN = 99; //未登录
    Map<Integer, String> MSG = ImmutableMap.<Integer, String>builder()
            .put(SUCCESS, "成功")
            .put(FAIL, "失败")
            .put(NOT_FOUND, "未找到")
            .put(MULTI_INSTANCE, "找到多个实例")
            .put(USED, "已被使用")
            .put(ONE_INSTANCE, "存在一个实例")
            .put(UNREGIST, "未注册")
            .put(NULL_FEILD, "空值")
            .put(ERROR_PASSWORD,"密码错误")
            .put(SQL_KEY_NOT_IN_DATABASE,"数据库查不带此键值：")
            .put(NULL_LOGIN, "请登录")
            .build();

}
