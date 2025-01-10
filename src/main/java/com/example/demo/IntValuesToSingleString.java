package com.example.demo;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntValuesToSingleString {
    public static void main(String[] args) {
        int[] intArray={1,2,3,4,5};
        Stream<String> stringStream = Arrays.stream(intArray).mapToObj(Integer::toString);
      //  stringStream.map(String::length).forEach(System.out::print);
       // String collect = stringStream.collect(Collectors.joining(","));
        //System.out.println(collect);
        Stream<int[]> intArray1 = Stream.of(intArray);
        // intArray1.forEach(System.out::print);


    }
}
