package com.xhu.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Cinema {
    private String cinemaId;

    private String companyId;

    private String countryId;

    private String cinemaName;

    private String cinemaAddress;

    private String cinemaTelphone;

}