package com.xhu.po;

import java.util.Date;

public class Actor {
    private String actorId;

    private String cityId;

    private String actorIntroduction;

    private String actorName;

    private Boolean actorSex;

    private Date actorBirthday;

    private String picture;

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

    public String getActorIntroduction() {
        return actorIntroduction;
    }

    public void setActorIntroduction(String actorIntroduction) {
        this.actorIntroduction = actorIntroduction == null ? null : actorIntroduction.trim();
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName == null ? null : actorName.trim();
    }

    public Boolean getActorSex() {
        return actorSex;
    }

    public void setActorSex(Boolean actorSex) {
        this.actorSex = actorSex;
    }

    public Date getActorBirthday() {
        return actorBirthday;
    }

    public void setActorBirthday(Date actorBirthday) {
        this.actorBirthday = actorBirthday;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }
}