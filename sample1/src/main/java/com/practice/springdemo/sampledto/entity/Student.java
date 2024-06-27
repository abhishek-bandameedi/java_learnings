package com.practice.springdemo.sampledto.entity;

import java.util.Date;
import lombok.Data;

@Data

public class Student {
    private Long id;

    private Date createdDate = new Date();

    private Date updatedDate = new Date();

    private String name;

    private String username;

    private String password;

}