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
public class WantWatch {
    private String wantWatchId;

    private String movieId;

    private String userId;

    private Date sureWantWatchTime;

}