package com.example.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
public class Employee {
    private Integer id;
    private String name;
    private Double salary;
    private String gender;
    private Integer age;
    private Department department;
    public Employee(Integer id, String name, Double salary, Integer age_){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public Employee(Integer id, String name, Double salary, Integer age, Department mathematics) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.gender = gender;
        this.department = mathematics;
    }

    public Employee(Integer id, String name, Double salary, Integer age, String gender, Department mathematics) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.gender = gender;
        this.department = mathematics;
    }



    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "nagaraju", 40000.0, 40, "male", new Department(1, "IT")),
                new Employee(2, "raju", 50000.0, 30, "female", new Department(2, "science")),
                new Employee(3, "kumar", 30000.0, 20, "male", new Department(3, "social")),
                new Employee(4, "vinod", 30000.0, 50, "female", new Department(1, "IT")),
                new Employee(5, "rajesh", 20000.0, 50, "Male", new Department(2, "science")));

        //Count-How many male and female employees are there in the organization?
        employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + "" + v));

        ///count and filter->	How many male and female employees are there in the IT team?
        Map<Department, List<Employee>> it1 = employeeList.stream().filter(employee -> employee.getDepartment().getName().equals("IT"))
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println("department " + it1);

        Map<String, Long> collect1 = it1.entrySet().stream().flatMap(m -> m.getValue().stream()).collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println("finally" + collect1);

        //Average-What is the average age of male and female employees?
        employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)))
                .forEach((k, v) -> System.out.println(k + "" + v));

        //Count-Count the number of employees in each department?
        employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + "" + v));

        //Average->	What is the average salary of each department?
        employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)))
                .forEach((k, v) -> System.out.println(k + "" + v));

        //Grouping with mapping -  List down the names of all employees in each department?
        Map<Department, List<String>> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println(collect);
        for (Map.Entry<Department, List<String>> entry : collect.entrySet()) {
            System.out.println(entry.getKey().getName() + "-----" + entry.getValue());
        }

        //>	Get the details of highest paid employee in the organization?
        Employee highestSalariedPerson = employeeList.stream().max(Comparator.comparing(Employee::getSalary)).get();
        System.out.println(highestSalariedPerson);

        //-Get the details of youngest male employee in the IT department?
        Employee employee1 = employeeList.stream()
                .filter(employee -> employee.getDepartment().getName().equals("IT")).min(Comparator.comparing(Employee::getAge)).get();


        //Print the name of all departments in the organization?


    }
}
