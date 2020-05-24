package com.xhu.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Ticket {
    private String ticketId;

    private String orderId;

    private String movieId;

    private String watchedId;

    private String seatId;

    private String fieldId;
}