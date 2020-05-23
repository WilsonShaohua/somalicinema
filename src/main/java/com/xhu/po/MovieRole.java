package com.xhu.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieRole {
    private String movieRoleId;

    private String movieRoleName;

    public String getMovieRoleId() {
        return movieRoleId;
    }
}