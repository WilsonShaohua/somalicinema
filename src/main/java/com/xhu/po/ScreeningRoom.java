package com.xhu.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScreeningRoom {
    private String screeningRoomId;

    private String cinemaId;

    private String screeningRoomName;

    private Integer screeningRoomCapacity;
}