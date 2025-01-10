package com.example.demo;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DemoApplication {
    public static void main(String[] args) {
        int a=10;
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;
        System.out.println("Max value of Integer = " + maxInt);
        System.out.println("Min value of Integer = " + minInt);

        String b = "12345";
        String d = "abcdef";
        for (Character c :b.toCharArray()) {
            Character.getNumericValue(c);
        }

        b.chars().map(Character::getNumericValue).forEach(System.out::println);

        Integer[] integerArray={1,2,3,4};


        List<Integer> list=new ArrayList<>();
        char[] charArray={'n','a','g','a'};
        int[] intArray = { 1, 2, 3, 4, 5 };
        long[] longArray={1,2,3,4,5};
        double[] doubleArray={1.0,2.0,3.0,4.0,5.0};
        String[] stringArray={"naga","raju","junna","yadav"};
     //   Arrays.stream(stringArray).map(String::length).forEach(System.out::println);
       // Stream.of(stringArray).map(String::length).forEach(System.out::println);
//        Stream<Integer> stream1 = Arrays.stream(integerArray);
//        Stream<Integer> intArray1 = Stream.of(integerArray);
//
//        IntStream primitiveInt = Arrays.stream(intArray);
//        Stream<int[]> primitiveStream = Stream.of(intArray);
//        //if you want to convert above to IntStream
//        IntStream intStream = primitiveStream.flatMapToInt(Arrays::stream);
//
//
//        primitiveInt.forEach(System.out::println);
//        primitiveStream.toArray();
//
//        String[] str = {"apple", "banana", "pear", "kiwi"};
//
//        Stream<String> stringStream1 = Stream.of(str);
//        Stream<String> arrayStream = Arrays.stream(str);
//
////        arrayStream.forEach(System.out::println);
////        stringStream1.forEach(System.out::println);
//
//        String str1="apple,banana,pear,kiwi";
//        Stream<String> stringStream = Stream.of(str1);
////        stringStream.forEach(System.out::println);
//
//
////        String collect3 = stringStream1.collect(Collectors.joining());
////        String collect4 = arrayStream.collect(Collectors.joining());
////
////        Stream<String> stringStream = Stream.of(str1);
////        String collect2 = stringStream.collect(Collectors.joining());
//
////        System.out.println(collect2);
////        System.out.println(collect3);
////        System.out.println(collect4);
//
//        Map<Integer, List<String>> collect = Arrays.stream(str).collect(Collectors.groupingBy(String::length));
////        System.out.println(collect);
//
//        String collect1 = Arrays.stream(str).sorted(Comparator.comparing(String::length)).collect(Collectors.joining(","));
////        System.out.println(collect1);
//
//        String reversed = Arrays.stream(str).sorted(Comparator.reverseOrder()).collect(Collectors.joining(","));
////        System.out.println(reversed);
//
//        Stream<String> stream = Arrays.stream(str);
////        System.out.println(stream);




    }
}
