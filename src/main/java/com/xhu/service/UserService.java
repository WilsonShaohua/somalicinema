package com.xhu.service;

import com.xhu.po.User;

/**
 * @author liu li
 * @date 2020/5/24 17:17
 */
public interface UserService {
    int userLogin(User user);

    int userRegist(User user);

    User selectUserByTelphone(String telphone);

    User selectUserByPrimaryKey(String userId);

    int updteUserByPrimaryKey(User user);

    boolean checkPassword(String userId, String userPassword);
}
