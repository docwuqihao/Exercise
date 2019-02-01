package com.wqh.boot;

import static java.util.Comparator.comparing;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.stream.Collectors;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class App {

    @Test
    public void test_system_properties() {
        Properties properties = System.getProperties();
        Map<Object, Object> map = new HashMap<>();
        properties.forEach(map::put);
        List<Map.Entry<Object, Object>> entries = map.entrySet().stream()
                .filter(entry -> !Objects.isNull(entry))
                .sorted(comparing(entry -> (String) entry.getKey())).collect(Collectors.toList());
        log.info(entries.toString());

    }

    @Test
    public void test_putIfAbsent() {
        Map<String, String> map = new HashMap<>();
        map.computeIfAbsent("key", k -> k + "1");
        log.info(map.get("key"));

    }

    @Test
    public void test_date() {
        Date createdTime = new Date(1548474112426L);
        log.info(createdTime.toString());
        Date date = new Date(1548474113866L);
        log.info(date.toString());


    }

}
