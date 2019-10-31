package com.example.cola;

import com.example.order.domain.entity.Order;
import lombok.extern.log4j.Log4j;


@Extension(country = "a", bizCode = "order", order = 2)
@Log4j
public class OrderCreateExtensionPointTwo implements ExtensionPointI<Order> {

    @Override
    public void execute(Order order) {

        log.info("2 is print");
        order.setOrderNo("2");
    }
}
