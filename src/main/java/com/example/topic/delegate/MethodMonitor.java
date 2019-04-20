package com.example.topic.delegate;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class MethodMonitor {

    private long start;

    private String method;

    public MethodMonitor(String method) {
        this.start = System.currentTimeMillis();
        log.info("monitor start...");
        this.method = method;
    }

    public void log() {
        long elapsedTime = System.currentTimeMillis() - start;
        log.info("end monitor...");
        log.info("Method:{},execution time:{},ms.", method, elapsedTime);
    }
}
