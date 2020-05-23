package com.xhu.po;

public class Theater {
    private String theaterId;

    private String personId;

    private String areaAddressId;

    private String theaterName;

    private String theaterIntroduced;

    public String getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(String theaterId) {
        this.theaterId = theaterId == null ? null : theaterId.trim();
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId == null ? null : personId.trim();
    }

    public String getAreaAddressId() {
        return areaAddressId;
    }

    public void setAreaAddressId(String areaAddressId) {
        this.areaAddressId = areaAddressId == null ? null : areaAddressId.trim();
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName == null ? null : theaterName.trim();
    }

    public String getTheaterIntroduced() {
        return theaterIntroduced;
    }

    public void setTheaterIntroduced(String theaterIntroduced) {
        this.theaterIntroduced = theaterIntroduced == null ? null : theaterIntroduced.trim();
    }
}