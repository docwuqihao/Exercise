package com.example.topic.kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class ProducerDemo {

    private static final String TOPIC_TEST = "test";


    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.put("bootstrap.servers", "192.168.0.149:9092");
        prop.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        prop.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        KafkaProducer kafkaProducer = new KafkaProducer(prop);


        for (int i = 0; i < 100; i++) {
            kafkaProducer.send(new ProducerRecord(TOPIC_TEST, String.valueOf(i)));
        }

        kafkaProducer.close();
    }
}
