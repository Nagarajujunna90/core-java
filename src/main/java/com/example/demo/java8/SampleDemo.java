package com.example.demo.java8;

import com.example.demo.model.Department;
import com.example.demo.model.Employee;

import java.util.*;
import java.util.stream.IntStream;

public class SampleDemo {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee(1, "nagaraju", 40000.0, 40, "Male", new Department(1, "mathematics")),
                new Employee(2, "raju", 50000.0, 30,"female", new Department(2, "science")),
                new Employee(3, "kumar", 30000.0, 20, "male",new Department(3, "social")),
                new Employee(4, "vinod", 30000.0, 50,"Male", new Department(1, "mathematics")),
                new Employee(5, "rajesh", 20000.0, 50,"Male", new Department(2, "science")));





        IntStream.rangeClosed(1,10).map(i->i*2).forEach(System.out::println);
        IntStream.iterate(1,n->n*2).limit(10).forEach(System.out::println);

        // Map<Integer, String> employeeList = list.stream().collect(Collectors.toMap(Employee::getId,Employee::getName));
      //  employeeList.forEach((k,v)-> System.out.println(k+" "+v));
      //  List<Employee> collect = list.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        //collect.forEach(System.out::println);

        int[] intary=new int[]{12,1,3,5};
        //Arrays.stream(intary).boxed().sorted().collect(Collectors.toList()).forEach(System.out::println);
        IntStream sorted = IntStream.of(intary).sorted();
        //sorted.forEach(System.out::println);

     List<Integer> integers = Arrays.asList(1, 34, 4, 5, 3,3,5);

        Integer collect = integers.stream().filter(integer -> integer%2==0).mapToInt(Integer::intValue).sum();
    //    System.out.println(collect);
//        Integer integer = integers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
//        System.out.println(integer);
//
//        integers.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);


        List<String> strings = Arrays.asList("nagaraju", "capgemini", "telangana", "warangal", "cg", "junna");
//        Map<Boolean, List<String>> booleanListMap = strings.stream().collect(Collectors.partitioningBy(s -> s.length() > 3));
//        for (Map.Entry<Boolean, List<String>> listMap:booleanListMap.entrySet()){
//            System.out.println(listMap.getKey()+" "+listMap.getValue());
//

      //  strings.stream().map(s->s.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);


    }
}
