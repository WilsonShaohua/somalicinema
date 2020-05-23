package com.xhu.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Preferential {
    private String preferentialId;

    private String preferentialName;

    private String preferentialIntroduction;

    private Boolean preferentialOnly;

    private BigDecimal preferentialPower;

    private Date preferentialStartDataTime;

    private Date preferentialEndDataTime;

}