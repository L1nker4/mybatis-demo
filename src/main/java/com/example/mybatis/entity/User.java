package com.example.mybatis.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {

    private String account;

    private String password;

    private String type;

    private String status;
}
