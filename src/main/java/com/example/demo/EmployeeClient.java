package com.example.demo;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeClient {
    public static void main(String[] args) {
        List<EmployeeWithStringDepartment> employeeList = Arrays.asList(
                new EmployeeWithStringDepartment(1, "nagaraju", 1000.0, "male", 50, "IT"),
                new EmployeeWithStringDepartment(2, "ayansh", 5000.0, "male", 20, "IT"),
                new EmployeeWithStringDepartment(3, "radha", 2000.0, "female", 30, "HR"),
                new EmployeeWithStringDepartment(4, "krishna", 2000.0, "male", 30, "HR"),
                new EmployeeWithStringDepartment(5, "vinod", 3000.0, "male", 20, "Finance")
        );
// How many male and female employees are there in the organization?
        Map<String, Long> collect = employeeList.stream().collect(Collectors.groupingBy(EmployeeWithStringDepartment::getGender, Collectors.counting()));
//        System.out.println(collect.get("male"));
//        System.out.println(collect.get("female"));

        //employeeList.stream().map(EmployeeWIthStringDepartment::getDepartment).forEach(System.out::println);

        double asDouble = employeeList.stream().mapToInt(EmployeeWithStringDepartment::getAge).average().getAsDouble();
        //System.out.println(asDouble);

        EmployeeWithStringDepartment employeeWIthStringDepartment = employeeList.stream().max(Comparator.comparing(EmployeeWithStringDepartment::getSalary)).get();
        //System.out.println(employeeWIthStringDepartment);
//        employeeList.stream()
//                .collect(Collectors.groupingBy(EmployeeWIthStringDepartment::getDepartment, Collectors.counting()))
//                .forEach((k,v)-> System.out.println(k+"---"+v));
//        employeeList.stream().collect(Collectors.groupingBy(EmployeeWIthStringDepartment::getDepartment, Collectors.averagingDouble(EmployeeWIthStringDepartment::getSalary)))
//                .forEach((k, v) -> System.out.println(k + " " + v));

//        EmployeeWIthStringDepartment employeeWIthStringDepartment1 = employeeList.stream().filter(e->e.getDepartment().equals("IT")).min(Comparator.comparing(EmployeeWIthStringDepartment::getAge)).get();
//        System.out.println(employeeWIthStringDepartment1);
//
//        Map<String, Long> collect1 = employeeList.stream().filter(e -> e.getDepartment().equals("HR")).collect(Collectors.groupingBy(EmployeeWIthStringDepartment::getGender, Collectors.counting()));
//        System.out.println(collect1);

        Map<String, Double> stringDoubleMap = employeeList.stream().collect(Collectors.groupingBy(EmployeeWithStringDepartment::getGender, Collectors.averagingDouble(EmployeeWithStringDepartment::getSalary)));
     //   System.out.println(stringDoubleMap);

        Map<String, List<String>> collect1 = employeeList.stream().collect(Collectors.groupingBy(EmployeeWithStringDepartment::getDepartment, Collectors.mapping(EmployeeWithStringDepartment::getName, Collectors.toList())));
       // System.out.println(collect1);

        DoubleSummaryStatistics collect2 = employeeList.stream().collect(Collectors.summarizingDouble(EmployeeWithStringDepartment::getSalary));
//        System.out.println(collect2.getAverage());
//        System.out.println(collect2.getSum());



        Map<Boolean, List<EmployeeWithStringDepartment>> collect3 = employeeList.stream().collect(Collectors.partitioningBy(em -> em.getAge() <= 25));
      //  System.out.println(collect3.get(false));

//        EmployeeWIthStringDepartment employeeWIthStringDepartment1 = employeeList.stream().min(Comparator.comparing(EmployeeWIthStringDepartment::getAge)).get();
//        System.out.println(employeeWIthStringDepartment1);
//        Map<String, Optional<EmployeeWIthStringDepartment>> collect4 = employeeList.stream().collect(Collectors.groupingBy(EmployeeWIthStringDepartment::getDepartment, Collectors.minBy(Comparator.comparing(EmployeeWIthStringDepartment::getAge))));
//


    }
}
