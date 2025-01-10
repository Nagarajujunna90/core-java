package com.example.demo.conversion;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ConversionUsingJava8 {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        Integer[] integerArray = {1, 2, 3, 4, 5};
        char[] charArray = {'a', 'b', 'c', 'd'};

        //1.Convert above 3 to string
        String intArrayToString = Arrays.stream(intArray).mapToObj(String::valueOf).collect(Collectors.joining());
        String integersToString = Arrays.stream(integerArray).map(String::valueOf).collect(Collectors.joining());
        String str = new String(charArray);
        System.out.println(intArrayToString + "=" + integersToString + "-" + str);

        //2.Convert above 3 to String[]
        String[] intStrArray = Arrays.stream(intArray).mapToObj(String::valueOf).toArray(String[]::new);
        String[] integerStringArray = Arrays.stream(integerArray).map(String::valueOf).toArray(String[]::new);
        String[] charToStringArray = new String(charArray).split("");
       // System.out.println(Arrays.toString(intStrArray) + "-" + Arrays.toString(integerStringArray) + "-" + Arrays.toString(charToStringArray));

        //3.Convert String to int,Integer and char(not valid question-char means single character)
        String s = "12345";
        int i = Integer.parseInt(s);
        Integer integer = Integer.valueOf(s);
       // System.out.println(i + "-" + integer);
        //but we need character or each value as separate use chars i.e chararray
        char[] charArray1 = s.toCharArray();
        s.chars().map(Character::getNumericValue).sum();
        System.out.println(i + "-" + integer + "-" + Arrays.toString(charArray1)+"-");


    }
}
