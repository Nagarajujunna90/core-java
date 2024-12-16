//package com.example.demo.java8;
//
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.List;
//import java.util.Map;
//import java.util.function.Function;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//import java.util.stream.Stream;
//
//public class CountWordOccurrences {
//
//    public static void main(String[] args) {
//        //["apple","banana","apple","mango"]
//        String s = "javainterview";
//
//
////        //How to count occurrences of each character of a String in Java 8?
////        Map<Character, Long> count = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
////        //  count.forEach((k, v) -> System.out.println(k + "" + v));
////        String[] strArray = {"apple", "banana", "apple", "mango"};
////        Stream<String> stringStream = Stream.of(strArray);
////
////        Map<String,List<String>> collect = stringStream.flatMap(Stream.of(String::split(",")))
////                collect(Collectors.groupingBy(String::toString, Collectors.toList()));
////
////        System.out.println(collect);
//
//
//        String str="12345";
//
//        int sum = str.chars().peek(System.out::println(a)).filter(!c -> c%2== 0).sum();
//        System.out.println(sum);
//
////        Map<String, Long> collect = stringStream.flatMap(s -> Arrays.stream(s.split(","))).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
////        System.out.println(collect);
////        Map<Integer, List<String>> collect4 = stringStream.collect(Collectors.groupingBy(String::length));
////        System.out.println(collect4);
////
////        String s="apple banana apple mango";
////        Stream<Character> characterStream = s.chars().mapToObj(c -> (char) c);
//
//
//        //How to filter array of strings by given prefix using java8
//        List<String> strings = Arrays.asList("nagaraju", "raju", "kumar", "ram");
//        List<String> j = strings.stream().filter(cc -> cc.startsWith("r")).collect(Collectors.toList());
//        //How to remove duplicates from array of integer
//        Integer[] ar = {1, 2, 10, 1, 2, 30, 34};
//        List<Integer> collect2 = Stream.of(ar).distinct().collect(Collectors.toList());
//        System.out.println(collect2);
//
//        //1) Given a list of integers, separate odd and even numbers?
//        Integer[] a = {1, 2, 3, 4, 5, 6};
//        Stream.of(a).collect(Collectors.partitioningBy(integer -> integer % 2 == 0)).forEach((k, v) -> System.out.println(k + " " + v));
//        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
//        listOfIntegers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//
//        //prints the multiples of 5
//        List<Integer> collect3 = Stream.of(1, 2, 3, 4).map(cc -> cc * 5).collect(Collectors.toList());
//
//
//    }
//
//
//}
