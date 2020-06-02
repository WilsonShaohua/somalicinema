package com.xhu.service.imp;

import com.xhu.mapper.TicketMapper;
import com.xhu.po.Ticket;
import com.xhu.po.TicketExample;
import com.xhu.service.TicketService;
import com.xhu.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author liu li
 * @date 2020/5/28 22:18
 */
@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketMapper ticketMapper;

    @Override
    public long countTicketAmountByMovieId(String movieId) {
        TicketExample ticketExample = new TicketExample();
        TicketExample.Criteria ticketCriteria = ticketExample.createCriteria();
        ticketCriteria.andMovieIdEqualTo(movieId);
        long totalTicket = ticketMapper.countByExample(ticketExample);
        return totalTicket;
    }

    @Override
    public BigDecimal countIicketTotalBox(String movieId) {
        TicketExample ticketExample = new TicketExample();
        TicketExample.Criteria ticketCriteria = ticketExample.createCriteria();
        ticketCriteria.andMovieIdEqualTo(movieId);
        List<Ticket> tickets = ticketMapper.selectByExample(ticketExample);
        BigDecimal totalBox = BigDecimal.ZERO;
        if (tickets == null || tickets.size() == 0)
            return totalBox;
        for (Ticket ticket : tickets) {
            totalBox.add(ticket.getTicketMoney());
        }
        return totalBox;
    }

    @Override
    public BigDecimal countTicketTodayBox(String movieId) {
        Date now = DateUtil.getCurrentTime();
        return countTicketDateBox(movieId, now);
    }

    @Override
    public BigDecimal countTicketDateBox(String movieId, Date date) {

        return null;
    }
}
