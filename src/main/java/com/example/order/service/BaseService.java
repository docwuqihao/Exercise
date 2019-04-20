package com.example.order.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.order.domain.entity.BaseEntity;
import com.example.order.domain.so.BaseSO;

public interface BaseService<T extends BaseEntity, S extends BaseSO> extends IService<T> {
    List<T> searchVOList(S so);
}
