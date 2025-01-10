package com.example.demo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Examples {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 3, 2);
        List<String> fullNames = Arrays.asList("Barry Allen", "Bruce Wayne", "Clark Kent");
        List<String> collect = fullNames.stream().flatMap(s -> Stream.of(s.split(" "))).sorted().collect(Collectors.toList());
        System.out.println(collect);



    }
}