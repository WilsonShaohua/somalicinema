package com.xhu.service;

import java.math.BigDecimal;

/**
 * @author liu li
 * @date 2020/5/28 22:12
 */
public interface TicketService {
    long countTicketAmountByMovieId(String movieId);

    BigDecimal countIicketTotalBox(String movieId);
}
