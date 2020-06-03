package com.xhu.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Field {
    private String fieldId;

    private String screeningRoomId;

    private String movieId;

    private Date fieldStartDataTime;

    private BigDecimal fieldMoney;

}