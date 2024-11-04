package com.example.demo.model;

import lombok.Data;

@Data
public class Department {
    private Integer id;
    private String name;

    public Department(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
