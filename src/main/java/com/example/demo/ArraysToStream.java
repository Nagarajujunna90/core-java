package com.example.demo;

import com.example.demo.model.Employee;

import java.util.Arrays;
import java.util.stream.*;

public class ArraysToStream {
    public static void main(String[] args) {
        char[] charArray = {'n', 'a', 'g', 'a'};
        int[] intArray = {1, 2, 3, 4, 5};
        long[] longArray = {1, 2, 3, 4, 5};
        double[] doubleArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] stringArray = {"naga", "raju", "junna", "yadav"};
        Employee[] employeeArray = {new Employee(1, "naga", 1.0, 1), new Employee(2, "raju", 2.0, 2)};

        IntStream intStream = Arrays.stream(intArray);
        LongStream longStream = Arrays.stream(longArray);
        DoubleStream doubleStream = Arrays.stream(doubleArray);
        Stream<String> stringStream = Arrays.stream(stringArray);
        Stream<String> streamOfMethod = Stream.of(stringArray);
        streamOfMethod.forEach(System.out::println);
        Stream<Employee> employeeStream = Arrays.stream(employeeArray);


        intStream.forEach(System.out::println);
        longStream.forEach(System.out::println);
        doubleStream.forEach(System.out::println);
        stringStream.forEach(System.out::println);
        employeeStream.forEach(System.out::println);


    }
}
