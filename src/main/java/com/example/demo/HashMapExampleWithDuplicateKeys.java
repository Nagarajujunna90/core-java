package com.example.demo;

import com.example.demo.model.Department;
import com.example.demo.model.Employee;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class HashMapExampleWithDuplicateKeys {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "nagaraju", 40000.0, 40, new Department(1, "mathematics"));
        Employee emp2 = new Employee(1, "nagaraju", 40000.0, 40, new Department(1, "mathematics"));
        List<Employee> list = Arrays.asList(
                emp1,
                new Employee(2, "raju", 50000.0, 30, new Department(2, "science")),
                new Employee(3, "kumar", 30000.0, 20, new Department(3, "social")),
                new Employee(4, "vinod", 30000.0, 50, new Department(1, "mathematics")),
                new Employee(5, "rajesh", 20000.0, 50, new Department(2, "science")));


        HashMap<Employee, String> hashMap = new HashMap<>();
        hashMap.put(emp1, "naga");
        hashMap.put(emp2, "naga");
        System.out.println(emp1.hashCode()==emp2.hashCode());
        System.out.println(emp1.equals(emp2.hashCode()));
    }
}
