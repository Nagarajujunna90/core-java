package com.example.demo.conversion;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ConvertStringToChar {
    public static void main(String[] args) {
        String a="abcd";
        char[] charArray = a.toCharArray();
        System.out.println(Arrays.toString(charArray));
      //  a.chars().forEach(c-> System.out.println((char)c));


        String[] strings={"a","b","c"};

        char[] charArray1 = Arrays.stream(strings).collect(Collectors.joining("")).toCharArray();
        char[] charArray2 = String.join("", strings).toCharArray();
        System.out.println(charArray1);


    }
}
