package com.xhu.service;

import com.xhu.po.Watched;

import java.math.BigDecimal;
import java.text.ParseException;

/**
 * @author liu li
 * @date 2020/5/27 20:53
 */
public interface WatchedhService {
    double movieScoreByMovieId(String movieId);

    BigDecimal totalTickedSale(String movieId);

    BigDecimal totalTickedSaleToday(String movieId) throws ParseException;

    void insert(Watched watched);
}
