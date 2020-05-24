package com.xhu.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class City {
    private String cityId;

    private String provinceId;

    private String cityName;

    private String cityEnglishName;


}