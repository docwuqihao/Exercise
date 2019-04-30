package com.example.order.service.impl;

import java.util.Date;

import com.example.order.domain.entity.Order;
import com.example.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class ManualServiceImpl {

    @Autowired
    private OrderService orderService;

    @Transactional(propagation = Propagation.NESTED)
    public void manualTransaction() {
        Order order = new Order();
        Date now = new Date();
        order.setOrderNo("i" + now.getTime());
        orderService.save(order);
    }

    @Transactional
    public Order getOrder(String id) {
        return orderService.getById(id);
    }
}
