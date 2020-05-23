package com.xhu.po;

import java.util.Date;

public class Field {
    private String fieldId;

    private String movieId;

    private Date fieldStartDataTime;

    private Date fieldEndDataTime;

    public String getFieldId() {
        return fieldId;
    }

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId == null ? null : fieldId.trim();
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId == null ? null : movieId.trim();
    }

    public Date getFieldStartDataTime() {
        return fieldStartDataTime;
    }

    public void setFieldStartDataTime(Date fieldStartDataTime) {
        this.fieldStartDataTime = fieldStartDataTime;
    }

    public Date getFieldEndDataTime() {
        return fieldEndDataTime;
    }

    public void setFieldEndDataTime(Date fieldEndDataTime) {
        this.fieldEndDataTime = fieldEndDataTime;
    }
}