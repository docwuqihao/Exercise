package com.example.order;

import java.util.Date;

import com.example.order.domain.entity.Order;
import com.example.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class DemoApplicationTests {

    @Autowired
    private OrderService orderService;

    @Test
    @Transactional(timeout = 10)
    public void test_CRUD() throws InterruptedException {
        Order order = new Order();
        order.setOrderNo("1234");
        order.setCreatedTime(new Date());
        orderService.save(order);
        Thread.sleep(20000);
    }
}
