package com.example.demo.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8DuplicatesInt {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};
        Map<Integer, Long> collect = Arrays.stream(arr).boxed().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
collect.entrySet().stream().filter(m->m.getValue()>1).map(s->s.getKey()).forEach(System.out::println);

//        System.out.println("Duplicate elements in given array: ");
//        //Searches for duplicate element
//        for(int i = 0; i < arr.length; i++) {
//            for(int j = i + 1; j < arr.length; j++) {
//                if(arr[i] == arr[j])
//                    System.out.println(arr[j]);
//            }
//        }

    }
}
