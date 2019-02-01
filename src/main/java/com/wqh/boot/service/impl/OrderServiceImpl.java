package com.wqh.boot.service.impl;

import com.wqh.boot.dao.OrderDao;
import com.wqh.boot.domain.entity.Order;
import com.wqh.boot.domain.so.OrderSO;
import com.wqh.boot.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl extends BaseServiceImpl<OrderDao, Order, OrderSO>
        implements OrderService {

}
