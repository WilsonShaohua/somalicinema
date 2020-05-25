package com.xhu.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private String orderId;

    private Date orderTime;

    private Date orderPayTime;

    private Date orderLimitTime;

    private BigDecimal orderMoney;

}