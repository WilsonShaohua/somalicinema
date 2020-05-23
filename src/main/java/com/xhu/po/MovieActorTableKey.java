package com.xhu.po;

public class MovieActorTableKey {
    private String movieId;

    private String actorId;

    private String movieRoleId;

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId == null ? null : movieId.trim();
    }

    public String getActorId() {
        return actorId;
    }

    public void setActorId(String actorId) {
        this.actorId = actorId == null ? null : actorId.trim();
    }

    public String getMovieRoleId() {
        return movieRoleId;
    }

    public void setMovieRoleId(String movieRoleId) {
        this.movieRoleId = movieRoleId == null ? null : movieRoleId.trim();
    }
}