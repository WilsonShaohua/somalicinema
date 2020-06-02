package com.xhu.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
    private String movieId;

    private String movieTypeId;

    private String movieName;

    private Date moviePublishingData;

    private String movieIntroduction;

    private String movieSourceAddress;

    private String moviePosterAddress;

    private Date movieDurationPlayback;

    private String worldCountryId;

}