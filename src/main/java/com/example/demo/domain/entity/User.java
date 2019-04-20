package com.example.demo.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("User")
@TableName("ge_user")
public class User extends BaseEntity {

    private String username;

    private String password;

    private String role;

}
