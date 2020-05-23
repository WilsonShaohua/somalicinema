package com.xhu.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Theater {
    private String theaterId;

    private String personId;

    private String areaAddressId;

    private String theaterName;

    private String theaterIntroduced;


}