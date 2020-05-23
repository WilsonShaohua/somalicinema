package com.xhu.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScreeningRoom {
    private String screeningRoomId;

    private String fieldId;

    private String theaterId;

    private String screeningRoomName;

    private Integer screeningRoomCapacity;
}