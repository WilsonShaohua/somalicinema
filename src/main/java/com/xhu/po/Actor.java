package com.xhu.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Actor {
    private String actorId;

    private String cityId;

    private String userId;

    private String actorEnglishName;

    private String actorIntroduction;


}