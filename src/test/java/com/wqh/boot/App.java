package com.wqh.boot;

import java.nio.charset.Charset;
import java.util.Properties;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;

@Slf4j
public class App {

    @Test
    public void test_system_properties() {
        Properties properties = System.getProperties();
        properties.list(System.out);
    }

    @Test
    public void test_base64_md5() {

        String str =
                "{\"orderId\":\"3034692486604724230\",\"internalOrderId\":\"J18122910000447\",\"internalOrderTime\":1546069018201,\"customerCode\":\"S121314\",\"mapType\":\"1\",\"consigneeName\":\"j**\",\"consigneeMobile\":\"[13020294464,986]\",\"consigneeAddress\":\"华东政法大学长宁校区上海市长宁区万航渡路1575号\",\"consigneeLongitude\":121.41733,\"consigneeLatitude\":31.22643,\"orderAmount\":0.03,\"orderWeight\":2.0,\"itemPrice\":\"0.02,0.0,0.01,\",\"itemWeight\":\"1.0,1.0,\",\"itemName\":\"宫保鸡丁-9,宫保鸡丁-0,餐盒,\",\"itemNum\":\"1,1,1,\",\"daySn\":\"7\",\"dataSource\":\"ele\",\"timeliness\":\"immediate\"}";
        String encodeStr = base64Md5Encode(str + "sphhQMSbc#itemd7Z6YUgN0XkeaYpHZ1");
        //hbT8Y4HJRMcZD0j3zuL/vw==
        log.info(encodeStr);
    }

    private String base64Md5Encode(String str) {
        String digest1 = DigestUtils.md5Hex(str.getBytes());
        ;
        return Base64.encodeBase64String(digest1.getBytes(Charset.forName("utf8")));

    }
}
