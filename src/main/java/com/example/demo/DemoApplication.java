package com.example.demo;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static java.util.Comparator.comparingDouble;
import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;

public class DemoApplication {
    public static void main(String[] args) throws Exception {
        String[] str = {"Hello", "World"};
        Stream<String> str1 = Stream.of(str);

        int num[] = {1, 2, 3, 4};
       // System.out.println(Arrays.stream(num).count());

        int num2[] = {1, 2, 3, 4};
        long count1 = Stream.of(num2).count();
      //  System.out.println(count1);

        long count = Stream.of(num2).flatMapToInt(Arrays::stream).count();
         System.out.println(count);

        String st = "12345";

        int sum = st.chars().map(Character::getNumericValue).filter(s -> s % 2 != 0).sum();

        List<Employee> list = Arrays.asList(
                new Employee(1, "abc", "IT", 300.0),
                new Employee(1, "xyz", "Finance", 2.0),
                new Employee(1, "pqr", "Finance", 30.0)
        );

        list.stream().max(Comparator.comparingDouble(Employee::getSalary)).ifPresent(System.out::println);

        Map<String, Optional<Employee>> highestSalariesByDept = list.stream().
                collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));

        highestSalariesByDept.forEach((dept, employee) -> System.out.println("Department: " + dept +
                ", Highest Salary: " + (employee.isPresent() ? employee.get() : "N/A")));

        //LongStream.rangeClosed(1,10).boxed().collect(Collectors.toList()).forEach(System.out::println);
        //Stream.iterate(1,n->n+1).limit(10).collect(Collectors.toList()).forEach(System.out::println);
//        Random rand = new Random();
//        Stream.generate(() -> rand.nextInt(10)).limit(10).sorted().collect(Collectors.toList()).forEach(System.out::println);
        //List<Integer> integerList = Arrays.asList(1, 2, 34, 3, 2, 2);
        //integerList.stream().distinct().collect(Collectors.toList()).forEach(s-> System.out.println(s));



    String ss = "Pawan kavita kiyansh Patidar Patidar";
    StringBuilder ress = new StringBuilder();

    Map<Character, Integer> fre = ss.chars().boxed()
            .collect(Collectors.toMap(k->Character.valueOf((char)k.intValue()),k->1,Integer::sum));

    fre.forEach((k, v) -> System.out.println((k + ":" + v)));

    fre.entrySet().forEach(e ->{
        //System.out.println(e.getKey() + ":" + e.getValue());
        //ress.append(String.valueOf(e.getKey())+e.getValue());
    });

    fre.forEach((k,v)->{
        //System.out.println("Item : " + k + " Count : " + v);
        ress.append(String.valueOf(k)+String.valueOf(v));
    });

    System.out.println(ress.toString());
}
}


@AllArgsConstructor
@Data
class Employee {
    private Integer id;
    private String name;
    private String department;
    private Double salary;

}