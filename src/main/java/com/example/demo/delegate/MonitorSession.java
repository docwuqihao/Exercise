package com.example.demo.delegate;

public class MonitorSession {
    private static final ThreadLocal<MethodMonitor> local = new ThreadLocal<>();

    public static void begin(String method) {
        MethodMonitor methodMonitor = new MethodMonitor(method);
        local.set(methodMonitor);
    }

    public static void end() {
        MethodMonitor methodMonitor = local.get();
        methodMonitor.log();
    }

}
