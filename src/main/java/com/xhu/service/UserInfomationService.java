package com.xhu.service;

import com.xhu.po.UserInfomation;

/**
 * @author liu li
 * @date 2020/5/26 19:05
 */
public interface UserInfomationService {
    UserInfomation findUserInfomationByUserId(String userId);

    UserInfomation findUserInfomationByUserTelphoneAndUserPasswprd(String userTelphone, String userPasword);
}
