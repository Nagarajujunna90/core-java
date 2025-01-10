package com.example.demo;

import com.example.demo.model.Department;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
public class EmployeeWithList {
    private Integer id;
    private String name;
    private Double salary;
    private Integer age;
    private String gender;
    private List<Department> department;

    public static void main(String[] args) {
        List<Department> departmentList = Arrays.asList(new Department(1, "IT"),
                new Department(2, "science"),
                new Department(3, "social"),
                new Department(1, "IT"),
                new Department(2, "science"));
        List<EmployeeWithList> employeeWithLists = Arrays.asList(
                new EmployeeWithList(1, "nagaraju", 40000.0, 40, "male", departmentList),
                new EmployeeWithList(2, "raju", 50000.0, 30, "female", departmentList),
                new EmployeeWithList(3, "kumar", 30000.0, 20, "male", departmentList),
                new EmployeeWithList(4, "vinod", 30000.0, 50, "female", departmentList),
                new EmployeeWithList(5, "rajesh", 20000.0, 50, "Male", departmentList));

        //How many(count) male and female employees are there in the organization?
        employeeWithLists.stream().collect(Collectors.groupingBy(EmployeeWithList::getGender,Collectors.counting())).forEach((k,v)-> System.out.println(k+"-"+v));
        //How many(count) male and female employees are there in the IT team?

    }

}

