package com.xhu.po;

public class AreaFilmReleaseKey {
    private String movieId;

    private String worldCountryId;

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId == null ? null : movieId.trim();
    }

    public String getWorldCountryId() {
        return worldCountryId;
    }

    public void setWorldCountryId(String worldCountryId) {
        this.worldCountryId = worldCountryId == null ? null : worldCountryId.trim();
    }
}