package com.example.order.controller;

import java.util.Date;

import com.example.order.domain.entity.Order;
import com.example.order.domain.so.OrderSO;
import com.example.order.domain.vo.PackVO;
import com.example.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
@Slf4j
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
    public PackVO<Order> add(@RequestBody Order order) throws Exception {
        PackVO<Order> packVO = new PackVO<>();
        order.setCreatedTime(new Date());
        if (orderService.save(order)) {
            packVO.setVo(order);
        }
        else {
            packVO.setSuccess(Boolean.FALSE);
        }
        log.info("Thread:{},{}", Thread.currentThread().getName(), order);
        orderService.sendOrder(order);
        return packVO;
    }

    @PostMapping("delete")
    public PackVO<Order> delete(@RequestParam Long id) throws Exception {
        PackVO<Order> packVO = new PackVO<>();
        orderService.removeById(id);
        return packVO;
    }

    @PostMapping("/send")
    public PackVO<Order> send(@RequestBody Order order) throws Exception {
        PackVO<Order> packVO = new PackVO<>();
        orderService.sendOrder(order);
        return packVO;
    }

    @PostMapping("/get")
    public PackVO<Order> get(@RequestParam String id) throws Exception {
        PackVO<Order> packVO = new PackVO<>();
        orderService.mybatisCache(id);
        return packVO;
    }


}
