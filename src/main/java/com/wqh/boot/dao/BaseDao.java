package com.wqh.boot.dao;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wqh.boot.domain.entity.BaseEntity;
import com.wqh.boot.domain.so.BaseSO;

public interface BaseDao<T extends BaseEntity, S extends BaseSO> extends BaseMapper<T> {

    List<T> searchVOList(S so);
}
