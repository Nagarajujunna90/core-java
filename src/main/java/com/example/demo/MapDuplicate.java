package com.example.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDuplicate {
    public static void main(String[] args) {
        List<EmployeeWIthStringDepartment> employeeList = Arrays.asList(
                new EmployeeWIthStringDepartment(1, "nagaraju", 1000.0, "male", 50, "IT"),
                new EmployeeWIthStringDepartment(1, "nagaraju", 1000.0, "male", 50, "IT")
        );

        HashMap<EmployeeWIthStringDepartment, String> hashMap = new HashMap<>();
        hashMap.put(employeeList.get(0), "nag");
        hashMap.put(employeeList.get(1), "nag");
        System.out.println(hashMap.size());

        List<String> stringList=Arrays.asList("a","b");
        for (int i=0;i<stringList.size();i++
             ) {


        }
    }
}
