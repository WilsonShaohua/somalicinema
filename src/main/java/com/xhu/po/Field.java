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
public class Field {
    private String fieldId;

    private String screeningRoomId;

    private String movieId;

    private Date fieldStartDataTime;
}