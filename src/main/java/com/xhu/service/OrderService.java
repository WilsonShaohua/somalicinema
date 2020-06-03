package com.xhu.service;

import com.xhu.po.Order;

import java.util.List;

/**
 * @author liu li
 * @date 2020/6/3 17:19
 */
public interface OrderService {
    List<Order> selectAll();

    Order selectId(String orderId);

    void insert(Order order);

    void update(Order order);
}
