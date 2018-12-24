package com.wqh.boot.vo;

import lombok.Getter;
import lombok.Setter;

public class Message {

    @Setter
    @Getter
    private int id;

    @Setter
    @Getter
    private String message;

    public Message() {
    }

    public Message(int id, String message) {
        this.id = id;
        this.message = message;
    }
}
