package com.wqh.boot;

import static java.util.Comparator.comparing;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.UUID;
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

    @Test
    public void test_date_sub() {
        Date date = new Date();
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.MINUTE, 30);
        Date date2 = instance.getTime();

        LocalDateTime dateTime2 = LocalDateTime.ofInstant(date2.toInstant(),
                ZoneId.systemDefault());
        LocalDateTime dateTime1 = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        log.info(dateTime1.toString());
        log.info(dateTime2.toString());

        LocalDateTime dateTime3 = dateTime2.minus(2, ChronoUnit.HOURS);
        log.info("sendEndDate - 2hours ={}", dateTime3.toString());

    }

    @Test
    public void testUUID() {

        String s = UUID.randomUUID().toString();
        log.info(s);
        log.info("origin length:{}", s.length());
        String s2 = s.replaceAll("-", "");
        log.info("replace -:{}", s2);
        log.info("replace length:{}", s2.length());
    }

    @Test
    public void testCalander() {

        Calendar instance = Calendar.getInstance();

        log.info(instance.getTime().toString());

        instance.add(Calendar.HOUR, 6);

        log.info(instance.getTime().toString());
    }

    @Test
    public void test_split() {
        String treePath = "1|62779|62868|62887";
        String[] split = treePath.split("\\|");
        Long countyId = Long.valueOf(split[split.length - 1]);
        log.info(countyId.toString());
    }

}
