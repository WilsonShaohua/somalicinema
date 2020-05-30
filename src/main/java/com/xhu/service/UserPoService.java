package com.xhu.service;

import com.xhu.po.UserPo;

/**
 * @author liu li
 * @date 2020/5/26 19:05
 */
public interface UserPoService {
    UserPo findUserInfomationByUserId(String userId);

    UserPo findUserInfomationByUserTelphoneAndUserPasswprd(String userTelphone, String userPasword);
}
