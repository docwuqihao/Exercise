package com.example.demo.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@TableName("ge_order")
@Alias("Order")
public class Order extends BaseEntity {

    private String orderNo;
}
