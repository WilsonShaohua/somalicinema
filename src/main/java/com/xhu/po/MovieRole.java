package com.xhu.po;

public class MovieRole {
    private String movieRoleId;

    private String movieRoleName;

    public String getMovieRoleId() {
        return movieRoleId;
    }

    public void setMovieRoleId(String movieRoleId) {
        this.movieRoleId = movieRoleId == null ? null : movieRoleId.trim();
    }

    public String getMovieRoleName() {
        return movieRoleName;
    }

    public void setMovieRoleName(String movieRoleName) {
        this.movieRoleName = movieRoleName == null ? null : movieRoleName.trim();
    }
}