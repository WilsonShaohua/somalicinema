package com.xhu.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Movie {
    private String movieId;

    private String movieTypeId;

    private String cityId;

    private String movieName;

    private Date moviePublishingData;

    private String movieIntroduction;

    private String movieSourceAddress;

    private String moviePosterAddress;

    private Date movieDurationPlayback;

    private Date movieLastTime;

}