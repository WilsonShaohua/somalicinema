package com.xhu.po;

import java.math.BigDecimal;
import java.util.Date;

public class Preferential {
    private String preferentialId;

    private String preferentialName;

    private String preferentialIntroduction;

    private Boolean preferentialOnly;

    private BigDecimal preferentialPower;

    private Date preferentialStartDataTime;

    private Date preferentialEndDataTime;

    public String getPreferentialId() {
        return preferentialId;
    }

    public void setPreferentialId(String preferentialId) {
        this.preferentialId = preferentialId == null ? null : preferentialId.trim();
    }

    public String getPreferentialName() {
        return preferentialName;
    }

    public void setPreferentialName(String preferentialName) {
        this.preferentialName = preferentialName == null ? null : preferentialName.trim();
    }

    public String getPreferentialIntroduction() {
        return preferentialIntroduction;
    }

    public void setPreferentialIntroduction(String preferentialIntroduction) {
        this.preferentialIntroduction = preferentialIntroduction == null ? null : preferentialIntroduction.trim();
    }

    public Boolean getPreferentialOnly() {
        return preferentialOnly;
    }

    public void setPreferentialOnly(Boolean preferentialOnly) {
        this.preferentialOnly = preferentialOnly;
    }

    public BigDecimal getPreferentialPower() {
        return preferentialPower;
    }

    public void setPreferentialPower(BigDecimal preferentialPower) {
        this.preferentialPower = preferentialPower;
    }

    public Date getPreferentialStartDataTime() {
        return preferentialStartDataTime;
    }

    public void setPreferentialStartDataTime(Date preferentialStartDataTime) {
        this.preferentialStartDataTime = preferentialStartDataTime;
    }

    public Date getPreferentialEndDataTime() {
        return preferentialEndDataTime;
    }

    public void setPreferentialEndDataTime(Date preferentialEndDataTime) {
        this.preferentialEndDataTime = preferentialEndDataTime;
    }
}