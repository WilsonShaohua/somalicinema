package com.xhu.po;

public class Seat {
    private String seatId;

    private String screeningRoomId;

    private Integer seatX;

    private Integer seatY;

    private Integer seatIsIt;

    public String getSeatId() {
        return seatId;
    }

    public void setSeatId(String seatId) {
        this.seatId = seatId == null ? null : seatId.trim();
    }

    public String getScreeningRoomId() {
        return screeningRoomId;
    }

    public void setScreeningRoomId(String screeningRoomId) {
        this.screeningRoomId = screeningRoomId == null ? null : screeningRoomId.trim();
    }

    public Integer getSeatX() {
        return seatX;
    }

    public void setSeatX(Integer seatX) {
        this.seatX = seatX;
    }

    public Integer getSeatY() {
        return seatY;
    }

    public void setSeatY(Integer seatY) {
        this.seatY = seatY;
    }

    public Integer getSeatIsIt() {
        return seatIsIt;
    }

    public void setSeatIsIt(Integer seatIsIt) {
        this.seatIsIt = seatIsIt;
    }
}