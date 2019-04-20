package com.example.demo.service.impl;

import java.util.Date;

import com.example.demo.dao.OrderDao;
import com.example.demo.domain.entity.Order;
import com.example.demo.domain.so.OrderSO;
import com.example.demo.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class OrderServiceImpl extends BaseServiceImpl<OrderDao, Order, OrderSO>
        implements OrderService {
    @Autowired
    ManualServiceImpl manualService;

    @Override
    @Transactional
    public void sendOrder(Order order) {
        order.setCreatedTime(new Date());
        save(order);
        manualService.manualTransaction();
        throw new RuntimeException("out error.");
    }

    @Transactional
    public void manualTransaction() {
        throw new DuplicateKeyException("mock duplicateKeyException");
    }

}
