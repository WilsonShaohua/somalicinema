package com.xhu.service.imp;

import com.xhu.mapper.WantWatchMapper;
import com.xhu.po.WantWatchExample;
import com.xhu.service.WantWatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liu li
 * @date 2020/5/28 10:24
 */
@Service
public class WantWatchServiceImpl implements WantWatchService {
    @Autowired
    private WantWatchMapper wantWatchMapper;

    /**
     * 统计有多少人想看指定movieId的电影
     *
     * @param movieId
     * @return
     */
    @Override
    public long countTotalWantByMovieId(String movieId) {
        WantWatchExample wantWatchExample = new WantWatchExample();
        WantWatchExample.Criteria wangWatchCriteria = wantWatchExample.createCriteria();
        wangWatchCriteria.andMovieIdEqualTo(movieId);
        long count = wantWatchMapper.countByExample(wantWatchExample);
        return count;
    }

    @Override
    public Map<String, Long> countTotalWantByMovieId(List<String> movieIds) {
        Map<String, Long> countIdWantWatch = new HashMap<>();
        for (String movieId : movieIds) {
            countIdWantWatch.put(movieId, countTotalWantByMovieId(movieId));
        }
        return countIdWantWatch;
    }
}
