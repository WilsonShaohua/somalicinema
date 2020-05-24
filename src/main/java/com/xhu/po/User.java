package com.xhu.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class User {
    private String userId;

    private String cityId;

    private Boolean userSex;

    private Date userBirthday;

    private String userPassword;

    private String userTelphone;

    private String userPictureAddress;

    private Date userCreateTime;

    private Date userLastLoadTime;

    private Boolean userIsDelete;

    private Boolean userIsLoad;

}