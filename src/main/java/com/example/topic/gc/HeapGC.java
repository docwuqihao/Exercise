package com.example.topic.gc;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HeapGC {


    public static void main(String[] args) {

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            String t = String.valueOf(i).intern();
        }
    }
}
