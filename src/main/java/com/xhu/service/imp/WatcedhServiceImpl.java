package com.xhu.service.imp;

import com.xhu.mapper.OrderMapper;
import com.xhu.mapper.TicketMapper;
import com.xhu.mapper.WatchedMapper;
import com.xhu.po.*;
import com.xhu.service.WatcedhService;
import com.xhu.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
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

    @Autowired
    private OrderMapper orderMapper;

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

        //获取当前时间
        Date nowDate = DateUtil.getDayStart(DateUtil.getCurrentTime());
        Date nowDay = DateUtil.getDayStart(nowDate);
        OrderExample orderExample = new OrderExample();
        OrderExample.Criteria orderCriteria = orderExample.createCriteria();
        //添加条件为今天开始和当前时间
        orderCriteria.andOrderTimeBetween(nowDay, nowDate);
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
}
