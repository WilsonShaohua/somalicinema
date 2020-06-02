package com.xhu.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WantWatch {
    private String wantWatchId;

    private String movieId;

    private String userId;

    private Date sureWantWatchTime;

}