package com.example.demo.conversion;

import java.util.Arrays;

public class ConvertStringToPrimitive {
    public static void main(String[] args) {

        //Single String Object to int
        String a = "12";
        try {
            int i = Integer.parseInt(a);//for primitive type return
            Integer integer = Integer.valueOf(a);//for Wrapper type return
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

        // String[] to integer
        String[] strArray = {"1", "n", "3", "4", "5"};

        //1.For Loop approach
        int[] ints = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            try {
                ints[i] = Integer.parseInt(strArray[i]);
            } catch (NumberFormatException e) {
                //ints[i]=0;
                // System.err.println("Error parsing: " + i + ". Skipping." + e.getMessage());
                continue;
            }
        }
        System.out.println(ints[0]);

        //using java8 approach
        int[] intArray = Arrays.stream(strArray).map(str -> {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException n) {
                return 0;
            }
        }).mapToInt(Integer::intValue).toArray();
        System.out.println(intArray[0]);
    }
}
