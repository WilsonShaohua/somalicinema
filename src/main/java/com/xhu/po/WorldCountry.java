package com.xhu.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorldCountry {
    private String worldCountryId;

    private String chauId;

    private String worldCountryName;

    public String getWorldCountryId() {
        return worldCountryId;
    }

}