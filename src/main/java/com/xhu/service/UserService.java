package com.xhu.service;

import com.xhu.po.User;

import java.util.Map;

/**
 * @author liu li
 * @date 2020/5/24 17:17
 */
public interface UserService {
    public int userLogin(User user);
    public int userRegist(User user);
    public Map<Integer,User> selectUserByTelphone(String telphone);
    public int updteUserByPrimaryKey(User user);
}
