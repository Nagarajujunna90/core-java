package com.example.demo.model;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeDataManagement {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "nagaraju", 40000.0, 40, "Male", new Department(1, "mathematics")),
                new Employee(2, "raju", 50000.0, 30, "female", new Department(2, "science")),
                new Employee(3, "kumar", 30000.0, 20, "male", new Department(3, "social")),
                new Employee(4, "vinod", 30000.0, 50, "Male", new Department(1, "mathematics")),
                new Employee(5, "rajesh", 20000.0, 50, "Male", new Department(2, "science")));


        //  How many male and female employees are there in the organization?

        Map<String, Long> collect = employeeList.stream().map(Employee::getGender).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        // System.out.println(collect);

        //>	Print the name of all departments in the organization?
        List<String> collect2 = employeeList.stream().map(Employee::getDepartment).collect(Collectors.mapping(Department::getName, Collectors.toList()));
            //or
        List<String> collect3 = employeeList.stream().map(Employee::getDepartment).map(Department::getName).collect(Collectors.toList());
        System.out.println(collect2);

        //>	What is the average age of male and female employees?
        double asDouble = employeeList.stream().mapToInt(Employee::getAge).average().getAsDouble();
        //>	Get the details of highest paid employee in the organization?
         employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary)).ifPresent(System.out::println);

        //>	Count the number of employees in each department?
        Map<String, Long> collect1 = employeeList.stream().map(Employee::getDepartment).collect(Collectors.groupingBy(Department::getName, Collectors.counting()));
        System.out.println(collect1);

        //>	What is the average salary of each department?
       // Map<Department, Double> collect4 = employeeList.stream().collect(Collectors.mapping(Employee::getDepartment,Department::getName)));
      //  System.out.println(collect4);
    }
}
