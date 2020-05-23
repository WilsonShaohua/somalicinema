package com.xhu.po;

import java.math.BigDecimal;

public class Pay {
    private String payId;

    private String payAccountId;

    private String orderId;

    private BigDecimal payMoneyNumber;

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId == null ? null : payId.trim();
    }

    public String getPayAccountId() {
        return payAccountId;
    }

    public void setPayAccountId(String payAccountId) {
        this.payAccountId = payAccountId == null ? null : payAccountId.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public BigDecimal getPayMoneyNumber() {
        return payMoneyNumber;
    }

    public void setPayMoneyNumber(BigDecimal payMoneyNumber) {
        this.payMoneyNumber = payMoneyNumber;
    }
}