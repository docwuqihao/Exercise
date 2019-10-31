/*
 * Copyright 2017 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.example.cola;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;


@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Component
public @interface Extension {
    String country() default BizScenario.DEFAULT_COUNTRY;

    String bizCode() default BizScenario.DEFAULT_BIZ_CODE;

    int order() default 0;
}
