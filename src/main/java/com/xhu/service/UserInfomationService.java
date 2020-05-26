package com.xhu.service;

import java.util.List;

/**
 * @author liu li
 * @date 2020/5/26 19:05
 */
public interface UserInfomationService {
    List<Object> findUserInfomationByUserId(String userId);
}
