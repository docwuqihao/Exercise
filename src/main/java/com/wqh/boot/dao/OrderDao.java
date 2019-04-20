package com.wqh.boot.dao;

import com.wqh.boot.domain.entity.Order;
import com.wqh.boot.domain.so.OrderSO;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDao extends BaseDao<Order, OrderSO> {
}
