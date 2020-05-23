package com.xhu.po;

public class OrderPreferentialKey {
    private String orderId;

    private String preferentialId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getPreferentialId() {
        return preferentialId;
    }

    public void setPreferentialId(String preferentialId) {
        this.preferentialId = preferentialId == null ? null : preferentialId.trim();
    }
}