package com.example.demo.dao;

import com.example.demo.domain.entity.Order;
import com.example.demo.domain.so.OrderSO;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDao extends BaseDao<Order, OrderSO> {
}
