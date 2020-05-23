package com.xhu.po;

public class ScreeningRoom {
    private String screeningRoomId;

    private String fieldId;

    private String theaterId;

    private String screeningRoomName;

    private Integer screeningRoomCapacity;

    public String getScreeningRoomId() {
        return screeningRoomId;
    }

    public void setScreeningRoomId(String screeningRoomId) {
        this.screeningRoomId = screeningRoomId == null ? null : screeningRoomId.trim();
    }

    public String getFieldId() {
        return fieldId;
    }

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId == null ? null : fieldId.trim();
    }

    public String getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(String theaterId) {
        this.theaterId = theaterId == null ? null : theaterId.trim();
    }

    public String getScreeningRoomName() {
        return screeningRoomName;
    }

    public void setScreeningRoomName(String screeningRoomName) {
        this.screeningRoomName = screeningRoomName == null ? null : screeningRoomName.trim();
    }

    public Integer getScreeningRoomCapacity() {
        return screeningRoomCapacity;
    }

    public void setScreeningRoomCapacity(Integer screeningRoomCapacity) {
        this.screeningRoomCapacity = screeningRoomCapacity;
    }
}