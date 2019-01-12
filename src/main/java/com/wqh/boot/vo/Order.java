package com.wqh.boot.vo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("Order")
@TableName("ge_order")
public class Order {


    private int id;

    private String orderId;
}
