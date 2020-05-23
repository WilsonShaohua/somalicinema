package com.xhu.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AreaAddress {
    private String areaAddressId;

    private String countryId;

    private String areaAddressName;

    private String areaAddressEnglishName;

    public String getAreaAddressId() {
        return areaAddressId;
    }
}