package com.example.demo.java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8StringReverse {
    public static void main(String[] args) {
        String s="nagaraju";
       // String[] strArry = s.split("");
        String collect = Stream.of(s).
                map(c -> new StringBuilder(c).reverse()).
                collect(Collectors.joining());
        System.out.println(collect);

//        String reverse="";
//        for (int i = strArry.length-1; i >=0 ; i--) {
//            reverse=reverse+strArry[i];
//        }
//        System.out.println(reverse);
    }
}
