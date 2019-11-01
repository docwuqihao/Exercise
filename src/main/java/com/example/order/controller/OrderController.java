package com.example.order.controller;

import com.example.cola.ExtensionRepository;
import com.example.order.domain.entity.Order;
import com.example.order.domain.so.OrderSO;
import com.example.order.domain.vo.PackVO;
import com.example.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private ExtensionRepository extensionRepository;

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

        extensionRepository.execute(order);

        log.info("Thread:{},{}", Thread.currentThread().getName(), order);
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
