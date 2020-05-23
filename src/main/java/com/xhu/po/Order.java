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

    private String payId;

    private String studioCardId;

    private String userId;

    private String orderName;

    private Date orderTime;

    private Date orderPaid;

    private Integer orderPayState;

    private Date orderLimitTime;

    private BigDecimal orderGetTicketCode;

    private Boolean orderTicketState;
}