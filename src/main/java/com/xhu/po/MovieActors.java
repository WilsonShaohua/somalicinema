package com.xhu.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieActors {
    private String movieActorsId;

    private String actorId;

    private String movieId;

    private String actorRoleId;

}