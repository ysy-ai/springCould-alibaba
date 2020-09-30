package com.yi.service;

import com.yi.domain.Order;
import org.springframework.stereotype.Service;


public interface OrderService {
    void createOrder(Order order);
}
