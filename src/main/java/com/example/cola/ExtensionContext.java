package com.example.cola;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class ExtensionContext {
    private static Map<Thread, Map<String, String>> CONTEXT = new ConcurrentHashMap<>();


    public static void set(String key, String value) {
        Thread currentThread = Thread.currentThread();
        Map<String, String> map = CONTEXT.getOrDefault(currentThread, new HashMap<>());
        map.put(key, value);
        CONTEXT.put(currentThread, map);
    }

    public static String get(String key) {
        Map<String, String> map = CONTEXT.get(Thread.currentThread());
        if (map == null) {
            return null;
        }
        return map.get(key);
    }


    public static void clear() {
        Map<String, String> map = CONTEXT.get(Thread.currentThread());
        if (map != null) {
            map.clear();
        }
    }
}
