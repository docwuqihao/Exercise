package com.example.order.service;

import com.example.order.domain.entity.Order;
import com.example.order.domain.so.OrderSO;

public interface OrderService extends BaseService<Order, OrderSO> {

    void sendOrder(Order order) throws Exception;

    void mybatisCache(String id);
}
