package com.xhu.po;

public class WorldCountry {
    private String worldCountryId;

    private String worldCountryName;

    private String worldCountryEnglishName;

    public String getWorldCountryId() {
        return worldCountryId;
    }

    public void setWorldCountryId(String worldCountryId) {
        this.worldCountryId = worldCountryId == null ? null : worldCountryId.trim();
    }

    public String getWorldCountryName() {
        return worldCountryName;
    }

    public void setWorldCountryName(String worldCountryName) {
        this.worldCountryName = worldCountryName == null ? null : worldCountryName.trim();
    }

    public String getWorldCountryEnglishName() {
        return worldCountryEnglishName;
    }

    public void setWorldCountryEnglishName(String worldCountryEnglishName) {
        this.worldCountryEnglishName = worldCountryEnglishName == null ? null : worldCountryEnglishName.trim();
    }
}