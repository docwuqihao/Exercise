package com.wqh.boot;

import com.wqh.boot.service.OrderService;
import com.wqh.boot.vo.Order;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ZBootApplicationTests {

    @Autowired
    private OrderService orderService;

    @Test
    public void test_CRUD() {
        Order order = new Order();
        order.setOrderId("1234");
        boolean insert = orderService.save(order);
        log.info("insert:{}", insert);
        log.info("Order:{}", order.toString());

        Order order1 = orderService.getById(order.getId());
        log.info(order1.toString());

    }

}

