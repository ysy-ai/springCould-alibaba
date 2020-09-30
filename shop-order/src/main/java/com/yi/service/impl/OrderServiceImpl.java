package com.yi.service.impl;

import com.yi.dao.OrderDao;
import com.yi.domain.Order;
import com.yi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;

    @Override
    public void createOrder(Order order) {
        Order order1 = order;
        System.out.println(order1);
        orderDao.save(order);
    }
}
