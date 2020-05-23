package com.xhu.po;

public class Province {
    private String provinceId;

    private String worldCountryId;

    private String provinceName;

    private String provinceEnglishName;

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId == null ? null : provinceId.trim();
    }

    public String getWorldCountryId() {
        return worldCountryId;
    }

    public void setWorldCountryId(String worldCountryId) {
        this.worldCountryId = worldCountryId == null ? null : worldCountryId.trim();
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    public String getProvinceEnglishName() {
        return provinceEnglishName;
    }

    public void setProvinceEnglishName(String provinceEnglishName) {
        this.provinceEnglishName = provinceEnglishName == null ? null : provinceEnglishName.trim();
    }
}