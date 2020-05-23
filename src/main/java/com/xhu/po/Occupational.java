package com.xhu.po;

public class Occupational {
    private String occupationalId;

    private String occupationalName;

    public String getOccupationalId() {
        return occupationalId;
    }

    public void setOccupationalId(String occupationalId) {
        this.occupationalId = occupationalId == null ? null : occupationalId.trim();
    }

    public String getOccupationalName() {
        return occupationalName;
    }

    public void setOccupationalName(String occupationalName) {
        this.occupationalName = occupationalName == null ? null : occupationalName.trim();
    }
}