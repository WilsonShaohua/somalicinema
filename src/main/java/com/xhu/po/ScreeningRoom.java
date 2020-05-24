package com.xhu.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class ScreeningRoom {
    private String screeningRoomId;

    private String cinemaId;

    private String screeningRoomName;

    private Integer screeningRoomCapacity;

}