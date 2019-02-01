package com.wqh.boot.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wqh.boot.vo.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDao extends BaseMapper<Order> {
}
