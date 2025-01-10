package com.example.demo.conversion;

import java.util.Arrays;

public class ConvertStringToWrapper {
    public static void main(String[] args) {
        String a="1234";
        Integer integer = Integer.valueOf(a);
        System.out.println(integer);

        String[] s={"1","2","3","4"};
        Integer[] array = Arrays.stream(s).map(Integer::valueOf).toArray(Integer[]::new);
        System.out.println(Arrays.toString(array));





    }
}
