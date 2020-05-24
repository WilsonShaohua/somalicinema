package com.xhu.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Seat {
    private String seatId;

    private String screeningRoomId;

    private Integer seatX;

    private Integer seatY;

    private Integer seatState;

}