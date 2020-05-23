package com.xhu.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Province {
    private String provinceId;

    private String worldCountryId;

    private String provinceName;

    private String provinceEnglishName;

}