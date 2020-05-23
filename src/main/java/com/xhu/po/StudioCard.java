package com.xhu.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudioCard {
    private String studioCardId;

    private String orderId;

    private String studioCardName;

    private Date studioCardStartDataTime;

    private Date studioCardLastTime;

    private BigDecimal studioCardSellMoney;

    private String studioCardIntroduced;
}