package com.example.demo.collectors;

import com.example.demo.model.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Java8Stream {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "nagaraju", 3200.2, 24),
                new Employee(2, "Junna", 300.2, 38),
                new Employee(3, "Advika", 200.2, 21));

        List<Employee> filterByAge = employeeList.stream().filter(employee -> employee.getAge() > 31).collect(Collectors.toList());
        List<String> nameOfEmployees = employeeList.stream().map(Employee::getName).collect(Collectors.toList());
        List<Employee> sortedEmployee = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).collect(Collectors.toList());
        List<Employee> distinctEmployees = employeeList.stream().distinct().collect(Collectors.toList());
        employeeList.stream().skip(1).collect(Collectors.toList());//.forEach(System.out::println);
        employeeList.stream().limit(1).collect(Collectors.toList());//.forEach(System.out::println);
        // employeeList.stream().peek(System.out::println).collect(Collectors.toList());

        //Terminal Operations:
        employeeList.stream().filter(employee -> employee.getSalary() > 100);//.forEach(System.out::println);
        //  System.out.println(first);
        Optional<Employee> findAll = employeeList.stream().filter(employee -> employee.getSalary() > 100).findAny();
       // System.out.println(findAll);

        //These aggregator methods we can do with Collectors also
        Employee max = employeeList.stream().max(Comparator.comparing(Employee::getSalary)).get();
        Employee maxByCollectors = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary))).get();
        //  System.out.println(max);
        Employee min = employeeList.stream().min(Comparator.comparing(Employee::getAge)).get();
        Employee minByCollectors = employeeList.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getAge))).get();
        // System.out.println(min);
        double sum = employeeList.stream().mapToDouble(Employee::getSalary).sum();
        double sumByCollectors = employeeList.stream().collect(Collectors.summingDouble(Employee::getSalary));
        // System.out.println(sum);
        double average = employeeList.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
        Double averageByCollectors = employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
        // System.out.println(average);
        long count = employeeList.stream().map(employee -> employee.getName().startsWith("N")).count();
        employeeList.stream().collect(Collectors.counting());
       // System.out.println(count);

        



    }
}
