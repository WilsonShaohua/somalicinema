package com.xhu.po;

public class PayAccount {
    private String payAccountId;

    private String payId;

    private String userId;

    private String preferentialId;

    private String payAccountName;

    private String payAccountNumber;

    public String getPayAccountId() {
        return payAccountId;
    }

    public void setPayAccountId(String payAccountId) {
        this.payAccountId = payAccountId == null ? null : payAccountId.trim();
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId == null ? null : payId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getPreferentialId() {
        return preferentialId;
    }

    public void setPreferentialId(String preferentialId) {
        this.preferentialId = preferentialId == null ? null : preferentialId.trim();
    }

    public String getPayAccountName() {
        return payAccountName;
    }

    public void setPayAccountName(String payAccountName) {
        this.payAccountName = payAccountName == null ? null : payAccountName.trim();
    }

    public String getPayAccountNumber() {
        return payAccountNumber;
    }

    public void setPayAccountNumber(String payAccountNumber) {
        this.payAccountNumber = payAccountNumber == null ? null : payAccountNumber.trim();
    }
}