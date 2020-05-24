package com.xhu.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Watched {
    private String watchedId;

    private String movieId;

    private String userId;

    private String ticketId;

    private Double movieScore;

    private String movieEvalution;

}