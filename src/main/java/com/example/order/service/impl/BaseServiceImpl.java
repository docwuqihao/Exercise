package com.example.order.service.impl;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.order.dao.BaseDao;
import com.example.order.domain.entity.BaseEntity;
import com.example.order.domain.so.BaseSO;
import com.example.order.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseServiceImpl<M extends BaseDao<T, S>, T extends BaseEntity, S extends BaseSO>
        extends ServiceImpl<M, T> implements BaseService<T, S> {

    @Autowired(required = false)
    private M baseDao;

    @Override
    public List<T> searchVOList(S so) {
        return baseDao.searchVOList(so);
    }
}
