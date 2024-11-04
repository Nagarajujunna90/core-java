package com.example.demo.java8;

import com.example.demo.model.Department;
import com.example.demo.model.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8StreamCreationWays {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee(1, "nagaraju", 40000.0, 40, new Department(1, "mathematics")),
                new Employee(2, "raju", 50000.0, 30, new Department(2, "science")),
                new Employee(3, "kumar", 30000.0, 20, new Department(3, "social")),
                new Employee(4, "vinod", 30000.0, 50, new Department(1, "mathematics")),
                new Employee(5, "rajesh", 20000.0, 50, new Department(2, "science")));


        //1.Creating a Stream from a Collection (List, Set, Queue)
        Stream<Employee> stream = list.stream();
        //2.Creating a Stream from an Array(primitives and Object type(custom also)
        int[] in=new int[]{1,2,3,5};
        IntStream intStr = Arrays.stream(in);
        //3.Creating a Stream using Stream.of()
        Stream<int[]> strOfIntArray = Stream.of(in);
        //4.Creating a Stream using Stream.generate()
        Stream<Double> randomNumbers = Stream.generate(Math::random);
        //5.Creating a Stream using Stream.iterate()
        Stream.iterate(0, i -> i + 2).limit(10);	////0,2,4,6,8,10,12,14,16,18
        //6.Creating an Empty Stream
        Stream<Object> empty = Stream.empty();//Object any type we can get//we can replace Object with any
        //7.Creating a Stream from String Tokens
        //8.Creating a Stream from a File

    }
}
