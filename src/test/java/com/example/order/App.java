package com.example.order;

import static java.util.Comparator.comparing;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
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

        String str = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<CEB512Message xmlns=\"http://www.chinaport.gov.cn/ceb\" version=\"1.0\" guid=\"19f5148e-ed74-4b4a-a12f-8d43d418cf78\">"
                + "<LogisticsReturn><guid>01E0C780-202E-4219-8500-227746678D77</guid><returnStatus>5</returnStatus><returnTime>20190321144240293</returnTime><returnInfo>预处理成功</returnInfo><logisticsCode>3301963H57</logisticsCode><logisticsNo>1553150483744</logisticsNo></LogisticsReturn></CEB512Message>";
    }

    @Test
    public void test_date() {
        Date date = new Date(2019, 4, 3, 0, 0, 0);
        System.out.println(date.getTime());

        ArrayList<Object> list = new ArrayList<>();
        System.out.println(list.get(0));
    }

}
