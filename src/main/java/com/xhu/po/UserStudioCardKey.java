package com.xhu.po;

public class UserStudioCardKey {
    private String userId;

    private String studioCardId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getStudioCardId() {
        return studioCardId;
    }

    public void setStudioCardId(String studioCardId) {
        this.studioCardId = studioCardId == null ? null : studioCardId.trim();
    }
}