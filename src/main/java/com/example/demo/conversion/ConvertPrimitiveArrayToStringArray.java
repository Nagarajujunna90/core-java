package com.example.demo.conversion;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ConvertPrimitiveArrayToStringArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};

        String c = "";
        for (int b : a) {
            c = c + b;
        }
        System.out.println(c);

        String collect = Arrays.stream(a).mapToObj(String::valueOf).collect(Collectors.joining());
        System.out.println(collect);

        String[] array = Arrays.stream(a).mapToObj(String::valueOf).toArray(String[]::new);
        System.out.println(Arrays.toString(array));


//
//        //Integer a=null;
//        String str = "Hello";
//        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i));
//        }
//        str.chars().forEach(c -> System.out.println((char) c));
//        Arrays.stream(a)
//                .mapToObj(String::valueOf).peek(s -> System.out.println()).forEach(System.out::println);
//
//        String s= String.valueOf(a);
        //   System.out.println(s);
//        String[] st = new String[a.length];
//        int index = 0;
//        for (Integer v : a) {
//            st[index++] = Integer.toString(v);
//        }
//
//        for (String s : st) {
//            System.out.println(s);
//        }

    }
}
