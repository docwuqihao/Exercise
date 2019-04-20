package com.example.demo.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.domain.entity.BaseEntity;
import com.example.demo.domain.so.BaseSO;

public interface BaseService<T extends BaseEntity, S extends BaseSO> extends IService<T> {
    List<T> searchVOList(S so);
}
