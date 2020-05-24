package com.xhu.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class MovieActors {
    private String movieActorsId;

    private String actorId;

    private String movieId;

    private String actorRoleId;

}