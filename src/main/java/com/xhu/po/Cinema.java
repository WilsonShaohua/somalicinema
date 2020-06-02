package com.xhu.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cinema {
    private String cinemaId;

    private String companyId;

    private String countryId;

    private String cinemaName;

    private String cinemaAddress;

    private String cinemaTelphone;
}