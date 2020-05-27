package com.xhu.service;

import java.math.BigDecimal;

/**
 * @author liu li
 * @date 2020/5/27 20:53
 */
public interface WatcedhService {
    double movieScoreByMovieId(String movieId);

    BigDecimal totalTickedSale(String movieId);

    BigDecimal totalTickedSaleToday(String movieId);
}
