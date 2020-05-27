package com.xhu.service.imp;

import com.xhu.mapper.TicketMapper;
import com.xhu.mapper.WatchedMapper;
import com.xhu.po.Ticket;
import com.xhu.po.TicketExample;
import com.xhu.po.Watched;
import com.xhu.po.WatchedExample;
import com.xhu.service.WatcedhService;
import com.xhu.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author liu li
 * @date 2020/5/27 20:54
 */
@Service
public class WatcedhServiceImpl implements WatcedhService {
    @Autowired
    private WatchedMapper watchedMapper;

    @Autowired
    private TicketMapper ticketMapper;

    @Override
    public double movieScoreByMovieId(String movieId) {
        WatchedExample watchedExample = new WatchedExample();
        WatchedExample.Criteria watchedCriteria = watchedExample.createCriteria();
        watchedCriteria.andMovieIdEqualTo(movieId);
        watchedCriteria.andMovieScoreIsNotNull();
        watchedCriteria.andMovieScoreNotIn(new ArrayList<Double>(Arrays.asList(0.0)));
        List<Watched> watchedList = watchedMapper.selectByExample(watchedExample);
        BigDecimal totalScore = BigDecimal.ZERO;
        for (Watched watched : watchedList) {
            totalScore.add(BigDecimal.valueOf(watched.getMovieScore()));
        }
        BigDecimal avgScore = totalScore.divide(BigDecimal.valueOf(watchedList.size()));
        return Double.parseDouble(avgScore.toString());
    }

    @Override
    public BigDecimal totalTickedSale(String movieId) {
        WatchedExample watchedExample = new WatchedExample();
        WatchedExample.Criteria watchedCriteria = watchedExample.createCriteria();
        watchedCriteria.andMovieIdEqualTo(movieId);
        List<Watched> watchedList = watchedMapper.selectByExample(watchedExample);
        List<String> ticketIds = new ArrayList<>();
        for (Watched watched : watchedList) {
            ticketIds.add(watched.getTicketId());
        }
        TicketExample ticketExample = new TicketExample();
        TicketExample.Criteria ticketCriteria = ticketExample.createCriteria();
        ticketCriteria.andTicketIdIn(ticketIds);
        List<Ticket> ticketList = ticketMapper.selectByExample(ticketExample);
        BigDecimal total = BigDecimal.ZERO;
        for (Ticket ticket : ticketList) {
            BigDecimal ticketPrice = ticket.getTicketMoney();
            total.add(ticketPrice);
        }
        return total;
    }

    @Override
    public BigDecimal totalTickedSaleToday(String movieId) {
        WatchedExample watchedExample = new WatchedExample();
        WatchedExample.Criteria watchedCriteria = watchedExample.createCriteria();
        watchedCriteria.andMovieIdEqualTo(movieId);
        List<Watched> watchedList = watchedMapper.selectByExample(watchedExample);
        List<String> ticketIds = new ArrayList<>();
        for (Watched watched : watchedList) {
            ticketIds.add(watched.getTicketId());
        }
        TicketExample ticketExample = new TicketExample();
        TicketExample.Criteria ticketCriteria = ticketExample.createCriteria();
        //获取当前时间
        Date nowDate = DateUtil.getDayStart(DateUtil.getCurrentTime());
        ticketCriteria.andTicketIdIn(ticketIds);
        List<Ticket> ticketList = ticketMapper.selectByExample(ticketExample);
        BigDecimal total = BigDecimal.ZERO;
        for (Ticket ticket : ticketList) {
            BigDecimal ticketPrice = ticket.getTicketMoney();
            total.add(ticketPrice);
        }
        return total;
    }
}
