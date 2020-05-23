package com.xhu.po;

import java.math.BigDecimal;
import java.util.Date;

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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId == null ? null : payId.trim();
    }

    public String getStudioCardId() {
        return studioCardId;
    }

    public void setStudioCardId(String studioCardId) {
        this.studioCardId = studioCardId == null ? null : studioCardId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName == null ? null : orderName.trim();
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getOrderPaid() {
        return orderPaid;
    }

    public void setOrderPaid(Date orderPaid) {
        this.orderPaid = orderPaid;
    }

    public Integer getOrderPayState() {
        return orderPayState;
    }

    public void setOrderPayState(Integer orderPayState) {
        this.orderPayState = orderPayState;
    }

    public Date getOrderLimitTime() {
        return orderLimitTime;
    }

    public void setOrderLimitTime(Date orderLimitTime) {
        this.orderLimitTime = orderLimitTime;
    }

    public BigDecimal getOrderGetTicketCode() {
        return orderGetTicketCode;
    }

    public void setOrderGetTicketCode(BigDecimal orderGetTicketCode) {
        this.orderGetTicketCode = orderGetTicketCode;
    }

    public Boolean getOrderTicketState() {
        return orderTicketState;
    }

    public void setOrderTicketState(Boolean orderTicketState) {
        this.orderTicketState = orderTicketState;
    }
}