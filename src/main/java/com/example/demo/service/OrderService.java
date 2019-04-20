package com.example.demo.service;

import com.example.demo.domain.entity.Order;
import com.example.demo.domain.so.OrderSO;

public interface OrderService extends BaseService<Order, OrderSO> {

    void sendOrder(Order order) throws Exception;
}
