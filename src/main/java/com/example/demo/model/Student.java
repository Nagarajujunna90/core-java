package com.example.demo.model;

import lombok.Data;

@Data
public class Student {
    private Integer id;
    private String name;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
