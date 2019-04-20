package com.example.demo.dao;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.domain.entity.BaseEntity;
import com.example.demo.domain.so.BaseSO;

public interface BaseDao<T extends BaseEntity, S extends BaseSO> extends BaseMapper<T> {

    List<T> searchVOList(S so);
}
