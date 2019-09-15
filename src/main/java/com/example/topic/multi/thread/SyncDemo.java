package com.example.topic.multi.thread;

public class SyncDemo {

    public void syncObject() {
        synchronized (this) {
            System.out.println("123");
        }
    }

}
