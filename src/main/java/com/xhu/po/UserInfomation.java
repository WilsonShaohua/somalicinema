package com.xhu.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author liu li
 * @date 2020/5/26 17:01
 * 用户信息类，标记用户个人信息。
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfomation {
    private User user;
    private List<Fun> funs;
    private String cityName;
    private String stateLifeName;

}
