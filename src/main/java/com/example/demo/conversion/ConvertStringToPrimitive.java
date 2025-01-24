package com.example.demo.conversion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertStringToPrimitive {
    public static void main(String[] args) {
        Map<String, Long> collect = "The quick brown fox jumped over the lazy dog."
                .chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Object::toString, Collectors.counting()));
        //System.out.println(collect);
        String b = "nagana";
        String[] split = b.split("");
        long na = Arrays.stream(split).filter(c -> c.equals("na")).count();
        System.out.println(na);
        // b.codePoints().forEach(System.out::println);
        String str = "Hello";
        String string = str.codePoints().filter(Character::isUpperCase).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();// count will be 1
     //   System.out.println(string);
        List<String> stringList=Arrays.asList("nagana");

        int na2 = Collections.frequency(stringList, "na");
        System.out.println(na2);
        long na1 = stringList.stream().filter(s -> s.contains("na")).count();
        System.out.println(na1);
        b.chars().mapToObj(c->(char)c).filter(character -> character.equals("na")).forEach(System.out::println);


//        System.out.println("--" + na++);
//
//
//        //Single String Object to int
//        String a = "12";
//
//        try {
//            int i = Integer.parseInt(a);//for primitive type return
//            Integer integer = Integer.valueOf(a);//for Wrapper type return
//        } catch (NumberFormatException e) {
//            System.out.println(e);
//        }
//
//        // String[] to integer
//        String[] strArray = {"1", "n", "3", "4", "5"};
//
//        //1.For Loop approach
//        int[] ints = new int[strArray.length];
//        for (int i = 0; i < strArray.length; i++) {
//            try {
//                ints[i] = Integer.parseInt(strArray[i]);
//            } catch (NumberFormatException e) {
//                //ints[i]=0;
//                // System.err.println("Error parsing: " + i + ". Skipping." + e.getMessage());
//                continue;
//            }
//        }
//        System.out.println(ints[0]);
//
//        //using java8 approach
//        int[] intArray = Arrays.stream(strArray).map(str -> {
//            try {
//                return Integer.parseInt(str);
//            } catch (NumberFormatException n) {
//                return 0;
//            }
//        }).mapToInt(Integer::intValue).toArray();
//        System.out.println(intArray[0]);
    }
}
