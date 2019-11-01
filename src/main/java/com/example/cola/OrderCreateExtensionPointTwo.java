package com.example.cola;

import com.example.order.domain.entity.Order;
import lombok.extern.slf4j.Slf4j;


@Extension(country = "a", bizCode = "order", order = 2)
@Slf4j
public class OrderCreateExtensionPointTwo implements ExtensionPointI<Order> {

    @Override
    public void execute(Order order) {

        log.info("2 is print");
        order.setOrderNo("2");
    }
}
