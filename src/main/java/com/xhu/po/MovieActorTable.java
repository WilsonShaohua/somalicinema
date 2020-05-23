package com.xhu.po;

public class MovieActorTable extends MovieActorTableKey {
    private String movieActorTableId;

    public String getMovieActorTableId() {
        return movieActorTableId;
    }

    public void setMovieActorTableId(String movieActorTableId) {
        this.movieActorTableId = movieActorTableId == null ? null : movieActorTableId.trim();
    }
}