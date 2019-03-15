package com.wqh.boot.controller;

import com.wqh.boot.domain.entity.Order;
import com.wqh.boot.domain.so.OrderSO;
import com.wqh.boot.domain.vo.PackVO;
import com.wqh.boot.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/search")
    public PackVO<Order> search(@RequestBody OrderSO so) {

        PackVO<Order> packVO = new PackVO<>();
        packVO.setVoList(orderService.searchVOList(so));
        return packVO;
    }

    @PostMapping("/save")
    public PackVO<Order> add(@RequestBody Order order) {
        PackVO<Order> packVO = new PackVO<>();
        if (orderService.save(order)) {
            packVO.setVo(order);
        }
        else {
            packVO.setSuccess(Boolean.FALSE);
        }
        return packVO;
    }
}
