package com.xhu.po;

public class AreaAddress {
    private String areaAddressId;

    private String countryId;

    private String areaAddressName;

    private String areaAddressEnglishName;

    public String getAreaAddressId() {
        return areaAddressId;
    }

    public void setAreaAddressId(String areaAddressId) {
        this.areaAddressId = areaAddressId == null ? null : areaAddressId.trim();
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId == null ? null : countryId.trim();
    }

    public String getAreaAddressName() {
        return areaAddressName;
    }

    public void setAreaAddressName(String areaAddressName) {
        this.areaAddressName = areaAddressName == null ? null : areaAddressName.trim();
    }

    public String getAreaAddressEnglishName() {
        return areaAddressEnglishName;
    }

    public void setAreaAddressEnglishName(String areaAddressEnglishName) {
        this.areaAddressEnglishName = areaAddressEnglishName == null ? null : areaAddressEnglishName.trim();
    }
}