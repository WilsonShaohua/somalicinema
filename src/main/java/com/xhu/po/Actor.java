package com.xhu.po;

public class Actor {
    private String actorId;

    private String cityId;

    private String userId;

    private String actorEnglishName;

    private String actorIntroduction;

    public String getActorId() {
        return actorId;
    }

    public void setActorId(String actorId) {
        this.actorId = actorId == null ? null : actorId.trim();
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getActorEnglishName() {
        return actorEnglishName;
    }

    public void setActorEnglishName(String actorEnglishName) {
        this.actorEnglishName = actorEnglishName == null ? null : actorEnglishName.trim();
    }

    public String getActorIntroduction() {
        return actorIntroduction;
    }

    public void setActorIntroduction(String actorIntroduction) {
        this.actorIntroduction = actorIntroduction == null ? null : actorIntroduction.trim();
    }
}