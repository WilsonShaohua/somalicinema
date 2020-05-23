package com.xhu.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieActorTableKey {
    private String movieId;

    private String actorId;

    private String movieRoleId;
}