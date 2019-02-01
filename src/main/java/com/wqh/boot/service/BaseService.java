package com.wqh.boot.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wqh.boot.domain.entity.BaseEntity;
import com.wqh.boot.domain.so.BaseSO;

public interface BaseService<T extends BaseEntity, S extends BaseSO> extends IService<T> {
    List<T> searchVOList(S so);
}
