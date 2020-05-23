package com.xhu.po;

import java.math.BigDecimal;
import java.util.Date;

public class StudioCard {
    private String studioCardId;

    private String orderId;

    private String studioCardName;

    private Date studioCardStartDataTime;

    private Date studioCardLastTime;

    private BigDecimal studioCardSellMoney;

    private String studioCardIntroduced;

    public String getStudioCardId() {
        return studioCardId;
    }

    public void setStudioCardId(String studioCardId) {
        this.studioCardId = studioCardId == null ? null : studioCardId.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getStudioCardName() {
        return studioCardName;
    }

    public void setStudioCardName(String studioCardName) {
        this.studioCardName = studioCardName == null ? null : studioCardName.trim();
    }

    public Date getStudioCardStartDataTime() {
        return studioCardStartDataTime;
    }

    public void setStudioCardStartDataTime(Date studioCardStartDataTime) {
        this.studioCardStartDataTime = studioCardStartDataTime;
    }

    public Date getStudioCardLastTime() {
        return studioCardLastTime;
    }

    public void setStudioCardLastTime(Date studioCardLastTime) {
        this.studioCardLastTime = studioCardLastTime;
    }

    public BigDecimal getStudioCardSellMoney() {
        return studioCardSellMoney;
    }

    public void setStudioCardSellMoney(BigDecimal studioCardSellMoney) {
        this.studioCardSellMoney = studioCardSellMoney;
    }

    public String getStudioCardIntroduced() {
        return studioCardIntroduced;
    }

    public void setStudioCardIntroduced(String studioCardIntroduced) {
        this.studioCardIntroduced = studioCardIntroduced == null ? null : studioCardIntroduced.trim();
    }
}