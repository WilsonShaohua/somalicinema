package com.xhu.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class WorldCountry {
    private String worldCountryId;

    private String chauId;

    private String worldCountryName;
}