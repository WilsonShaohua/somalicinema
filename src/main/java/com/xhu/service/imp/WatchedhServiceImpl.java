package com.xhu.service.imp;

import com.xhu.mapper.OrderMapper;
import com.xhu.mapper.TicketMapper;
import com.xhu.mapper.WatchedMapper;
import com.xhu.po.*;
import com.xhu.service.WatchedhService;
import com.xhu.utils.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.*;

/**
 * @author liu li
 * @date 2020/5/27 20:54
 */
@Service
@Slf4j
public class WatchedhServiceImpl implements WatchedhService {
    @Autowired
    private WatchedMapper watchedMapper;

    @Autowired
    private TicketMapper ticketMapper;

    @Autowired
    private OrderMapper orderMapper;
    private static Map<String,Double> movieIdScore = null;
    @Override
    public double movieScoreByMovieId(String movieId) {
        if(movieIdScore!= null && movieIdScore.containsKey(movieId)==true){
            return movieIdScore.get(movieId);
        }
        WatchedExample watchedExample = new WatchedExample();
        WatchedExample.Criteria watchedCriteria = watchedExample.createCriteria();
        watchedCriteria.andMovieIdEqualTo(movieId);
        watchedCriteria.andMovieScoreIsNotNull();
        watchedCriteria.andMovieScoreNotIn(new ArrayList<Double>(Arrays.asList(0.0)));
        List<Watched> watchedList = watchedMapper.selectByExample(watchedExample);
        BigDecimal totalScore = BigDecimal.ZERO;
        for (Watched watched : watchedList) {
            totalScore = totalScore.add(BigDecimal.valueOf(watched.getMovieScore()));
        }
        BigDecimal avgScore = BigDecimal.ZERO;
        try {
            avgScore = totalScore.divide(BigDecimal.valueOf(watchedList.size()));
        } catch (ArithmeticException e) {

        }
        double scode = avgScore.setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();
        if(movieIdScore == null)
                movieIdScore = new HashMap<>();
        movieIdScore.put(movieId, scode);
        return scode;
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
    public BigDecimal totalTickedSaleToday(String movieId) throws ParseException {

        //获取当前时间
        Date now = DateUtil.getCurrentTime();
        Date nowDayStart = DateUtil.getDayStart(now);

        OrderExample orderExample = new OrderExample();
        OrderExample.Criteria orderCriteria = orderExample.createCriteria();
        //添加条件为今天开始和当前时间
        orderCriteria.andOrderTimeBetween(nowDayStart, now);
        //查询今天之内的订单数据
        List<Order> orderList = orderMapper.selectByExample(orderExample);
        List<String> orderIds = new ArrayList<>();
        for (Order order : orderList) {
            orderIds.add(order.getOrderId());
        }

        TicketExample ticketExample = new TicketExample();
        TicketExample.Criteria ticketCriteria = ticketExample.createCriteria();
        //查询指定电影的电影票
        ticketCriteria.andMovieIdEqualTo(movieId);
        //查询指定订单的电影票
        if (orderIds != null && orderIds.size() > 0)
            ticketCriteria.andTicketIdIn(orderIds);
        List<Ticket> ticketList = ticketMapper.selectByExample(ticketExample);
        //计算票房
        BigDecimal total = BigDecimal.ZERO;
        for (Ticket ticket : ticketList) {
            BigDecimal ticketPrice = ticket.getTicketMoney();
            total.add(ticketPrice);
        }
        return total;
    }

    @Override
    public void insert(Watched watched) {
        watchedMapper.insertSelective(watched);
    }
}
