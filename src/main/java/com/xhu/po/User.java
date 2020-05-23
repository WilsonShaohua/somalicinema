package com.xhu.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String userId;

    private String personId;

    private Boolean userSex;

    private Date userBirthday;

    private String userPasswd;

    private String userInfo;
}