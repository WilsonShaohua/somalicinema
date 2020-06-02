package com.xhu.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Seat {
    private String seatId;

    private String screeningRoomId;

    private Integer seatX;

    private Integer seatY;

    private Integer seatState;
}