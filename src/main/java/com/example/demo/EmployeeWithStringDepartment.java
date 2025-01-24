package com.example.demo;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class EmployeeWithStringDepartment {
    private Integer id;
    private String name;
    private Double salary;
    private String gender;
    private int age;
    private String department;


}
