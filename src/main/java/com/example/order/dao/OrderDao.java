package com.example.order.dao;

import com.example.order.domain.entity.Order;
import com.example.order.domain.so.OrderSO;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDao extends BaseDao<Order, OrderSO> {
}
