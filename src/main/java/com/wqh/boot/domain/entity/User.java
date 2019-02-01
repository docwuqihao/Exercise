package com.wqh.boot.domain.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.ibatis.type.Alias;

@Data
@Alias("User")
@EqualsAndHashCode(callSuper = false)
public class User extends BaseEntity {

    private String username;

    private String password;

    private String role;

}
