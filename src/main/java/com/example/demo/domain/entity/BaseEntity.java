package com.example.demo.domain.entity;

import java.util.Date;

import lombok.Data;

@Data
public class BaseEntity {

    private int id;

    private Date createdTime;

}
