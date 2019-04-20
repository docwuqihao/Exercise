package com.example.order.dao;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.order.domain.entity.BaseEntity;
import com.example.order.domain.so.BaseSO;

public interface BaseDao<T extends BaseEntity, S extends BaseSO> extends BaseMapper<T> {

    List<T> searchVOList(S so);
}
