package com.xhu.service.imp;

import com.xhu.mapper.OrderMapper;
import com.xhu.po.Order;
import com.xhu.po.OrderExample;
import com.xhu.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liu li
 * @date 2020/6/3 17:24
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> selectAll() {
        return orderMapper.selectByExample(new OrderExample());
    }

    @Override
    public Order selectId(String orderId) {
        return orderMapper.selectByPrimaryKey(orderId);
    }

    @Override
    public void insert(Order order) {
        orderMapper.insert(order);
    }

    @Override
    public void update(Order order) {
        orderMapper.updateByPrimaryKey(order);
    }
}
