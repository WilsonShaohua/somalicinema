package com.xhu.service;

import java.util.List;
import java.util.Map;

/**
 * @author liu li
 * @date 2020/5/28 10:23
 */

public interface WantWatchService {
    long countTotalWantByMovieId(String movieId);

    Map<String, Long> countTotalWantByMovieId(List<String> movieIds);
}
