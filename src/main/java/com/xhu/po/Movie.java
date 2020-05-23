package com.xhu.po;

import java.util.Date;

public class Movie {
    private String movieId;

    private String movieName;

    private String movieEnglishName;

    private Date moviePublishingData;

    private String movieIntroduction;

    private String movieSourceAddress;

    private String moviePosterAddress;

    private Date movieDurationPlayback;

    private Double movieScore;

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId == null ? null : movieId.trim();
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName == null ? null : movieName.trim();
    }

    public String getMovieEnglishName() {
        return movieEnglishName;
    }

    public void setMovieEnglishName(String movieEnglishName) {
        this.movieEnglishName = movieEnglishName == null ? null : movieEnglishName.trim();
    }

    public Date getMoviePublishingData() {
        return moviePublishingData;
    }

    public void setMoviePublishingData(Date moviePublishingData) {
        this.moviePublishingData = moviePublishingData;
    }

    public String getMovieIntroduction() {
        return movieIntroduction;
    }

    public void setMovieIntroduction(String movieIntroduction) {
        this.movieIntroduction = movieIntroduction == null ? null : movieIntroduction.trim();
    }

    public String getMovieSourceAddress() {
        return movieSourceAddress;
    }

    public void setMovieSourceAddress(String movieSourceAddress) {
        this.movieSourceAddress = movieSourceAddress == null ? null : movieSourceAddress.trim();
    }

    public String getMoviePosterAddress() {
        return moviePosterAddress;
    }

    public void setMoviePosterAddress(String moviePosterAddress) {
        this.moviePosterAddress = moviePosterAddress == null ? null : moviePosterAddress.trim();
    }

    public Date getMovieDurationPlayback() {
        return movieDurationPlayback;
    }

    public void setMovieDurationPlayback(Date movieDurationPlayback) {
        this.movieDurationPlayback = movieDurationPlayback;
    }

    public Double getMovieScore() {
        return movieScore;
    }

    public void setMovieScore(Double movieScore) {
        this.movieScore = movieScore;
    }
}