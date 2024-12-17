package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sample {
    public static void main(String[] args) {
        //convert int[] to Integer[]
        int[] numbers = {1, 2, 3, 4, 5};
        Integer[] integerArray={1,2,3,4,5};
        int[] ints = Arrays.stream(integerArray).mapToInt(x -> x).toArray();


//
//        // Example 1: peek() without a terminal operation
//        IntStream.of(numbers)
//                .peek(x -> {
//                    x += 10; // This has no effect on the original array
//                    System.out.println("Inside peek: " + x); // This will print
//                }); // No terminal operation, so peek is not executed
//
//        IntStream.of(numbers)
//                .filter(x -> x % 2 == 0)
//                .peek(x -> System.out.println("Filtered value: " + x)) // Print even numbers
//                .forEach(x -> {});
//        Integer[] integerArray={1,2,3,4,5};
//        //convert Integer[] to int[]
//       Stream.of(integerArray).peek(System.out::println);
//
//        //convert String[] to String
//        String[] strArray={"naga","raju","junna"};
//        Stream.of(strArray).peek(s -> System.out.println("Element seen: " + s)) // Print each element
//                .forEach(System.out::println);
//      //  System.out.println(count);
        List<Integer> list=Arrays.asList(1,2,3,4);
        String[] strArray={"naga","raju","junna"};
        list.stream().peek(s-> System.out.println("Element seen: "+s)).
                 forEach(System.out::println);
    //    System.out.println(str);
        //String to String[]

      //  System.out.println( Arrays.toString(strArr1));

    }
}
