package com.example.demo;

import java.util.Arrays;
import java.util.Objects;

public class IntTypeValuesToStringArray {
    public static void main(String[] args) {
        int[] intNumbers = {1, 2, 3, 4, 5};
        //o/p  {"1","2","3","4","5"}
        String[] stringArray = Arrays.stream(intNumbers).mapToObj(Integer::toString).toArray(String[]::new);
        System.out.println(Arrays.toString(stringArray));

        String[] stringsWithIntvalue = {"1", "2", "3", "4", "5"};
        System.out.println(Arrays.toString(stringArray));

        Integer[] integersArray={1,2,3,4,5};
        String[] stringArray2 = Arrays.stream(integersArray).map(Objects::toString).toArray(String[]::new);
        System.out.println(Arrays.toString(stringArray2));

    }

}
