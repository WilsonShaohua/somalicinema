package com.xhu.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Field {
    private String fieldId;

    private String screeningRoomId;

    private String movieId;

    private Date fieldStartDataTime;
}