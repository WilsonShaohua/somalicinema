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

    private String cityId;

    private String stateLifeId;

    private String userName;

    private Boolean userSex;

    private Date userBirthday;

    private String userPassword;

    private String userTelphone;

    private String userPictureAddress;

    private Date userCreateTime;

    private Date userLastLoadTime;

    private Boolean userIsDelete;

    private Boolean userIsLoad;

    private String userPersonalitySignature;

}