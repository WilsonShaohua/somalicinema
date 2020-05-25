package com.xhu.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {
    private String ticketId;

    private String orderId;

    private String movieId;

    private String watchedId;

    private String seatId;

    private String fieldId;
}