package com.xhu.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pay {
    private String payId;

    private String payAccountId;

    private String orderId;

    private BigDecimal payMoneyNumber;

}