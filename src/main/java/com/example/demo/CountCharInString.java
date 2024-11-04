package com.example.demo;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharInString {
    public static void main(String[] args) {
        String s="aabbccddd";
        int count=0;
        String[] strArray = s.split("");
        Map<String, Long> collect = Arrays.stream(strArray).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect.forEach((k,v)-> System.out.println(k+" "+v));

    }
}
