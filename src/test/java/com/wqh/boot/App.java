package com.wqh.boot;

import java.util.Properties;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class App {

    @Test
    public void test_system_properties() {
        Properties properties = System.getProperties();
        properties.list(System.out);
    }

}
