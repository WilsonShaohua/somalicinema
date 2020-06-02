package com.xhu.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Actor {
    private String actorId;

    private String cityId;

    private String actorIntroduction;

    private String actorName;

    private Boolean actorSex;

    private Date actorBirthday;

}