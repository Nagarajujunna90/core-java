package com.example.demo.conversion;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ConvertWrapperToString {
    public static void main(String[] args) {
        Integer i = 1000;
        String string = i.toString();
        String s = String.valueOf(i);
        System.out.println(string);

        Integer[] integerArray = {1, 2, 3, 4};
        String string2 = "";
        for (Integer c : integerArray) {
            string2 = string2 + c;
        }
        System.out.println(string2);

        String collect = Arrays.stream(integerArray).map(String::valueOf).collect(Collectors.joining());
        System.out.println(collect);
        String[] array = Arrays.stream(integerArray).map(String::valueOf).toArray(String[]::new);
        System.out.println(Arrays.toString(array));


    }
}
