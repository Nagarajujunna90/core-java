package com.example.demo.java8;

import com.example.demo.model.Employee;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GenericStreamCreation {
    public static void main(String[] args) {

        Boolean[] booleanArray = new Boolean[]{true, false, true};
        Stream<Boolean> streamOfBoolean = Stream.of(booleanArray);
        Character[] charArray = new Character[]{'a', 'c', 'd'};
        Stream<Character> steamOfChar = Stream.of(charArray);

       // of();
        //from var values:
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);  //from var args

        //from array of values:
        Stream<Integer> streamArray = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );  //from array

        //from the list:
        List<String> list = Arrays.asList("A", "B", "C", "D");
        //from the set
        Set<String> fruitSet = new HashSet<>(Arrays.asList("A", "B", "C", "D"));
        //from the Map
        Map<Integer,String> stringMap=new HashMap<>();
        stringMap.put(12,"naga");
        Stream<Integer> stream1 = stringMap.keySet().stream();
        Stream<String> stream2 = stringMap.values().stream();
        Stream<Map.Entry<Integer, String>> stream3 = stringMap.entrySet().stream();

        int[] integer = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        IntStream streamOfInteger = IntStream.of(integer);


        Long[] longArray = new Long[]{1L, 2L, 3L, 5L, 6L};
        Stream<Long> streamOfLong = Stream.of(longArray);
        Double[] doubleArray = new Double[]{1.0, 3.0, 4.0, 2.0};
        Stream<Double> streamOfDouble = Stream.of(doubleArray);
        String[] stringArray = new String[]{"abc", "def", "ghi"};
        Stream<String> streamOfString = Stream.of(stringArray);
        Employee employee = new Employee(1, "nagaraju", 12.0, 123);
        Stream<Employee> streamOfEmployee = Stream.of(employee);





    }
}
