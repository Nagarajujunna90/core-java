package com.example.demo.java8;

import com.example.demo.model.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Java8StreamToAndFromArray {
    public static void main(String[] args) {
        int[] in = new int[]{10, 11, 12, 43};
        long[] ln = new long[]{10, 32, 42, 4};
        double[] db = new double[]{12.3, 2.2, 12.2, 2};
        String[] stingArg = new String[]{"Pen", "Pencil", "Pen", "Notebook"};

        Stream<Double> randomNumbers = Stream.generate(Math::random);
        // Limiting the stream to 5 elements and printing them
        // randomNumbers.limit(5).forEach(System.out::println);
        Stream<Integer> infiniteEvenNumbers = Stream.iterate(0, n -> n + 2).limit(10);
        infiniteEvenNumbers.forEach(System.out::println);

        Stream<ArrayList> empty = Stream.empty();
        // String lowercaseText = (String) collect2;

        IntStream stream = Arrays.stream(in);
        LongStream stream2 = Arrays.stream(ln);
        DoubleStream stream3 = Arrays.stream(db);
        Stream<String> stream4 = Arrays.stream(stingArg);

        Stream<int[]> in1 = Stream.of(in);
        Stream<long[]> ln1 = Stream.of(ln);
        Stream<double[]> db1 = Stream.of(db);
        Stream<String> stream41 = Stream.of(stingArg);
        Stream<String> stingArg2 = Stream.of("Pen", "Pencil", "Pen");

        Stream<String[]> stingArg1 = Stream.of(stingArg, new String[]{});

//Convert Stream to Arrays:
        IntStream intStream = Arrays.stream(new int[]{1, 2, 3});
        int[] primitiveArray = intStream.toArray();

/*
Java program to convert a stream of Integers to primitive int array.
 Note that mapToInt() returns an instance of IntStream type.
 And IntStream.toArray() returns an int[]. This is the reason we are not using any generator function.
*/

        Stream<Integer> integerStream = Arrays.stream(new Integer[]{1, 2, 3});
        int[] primitivesArray = integerStream.mapToInt(i -> i).toArray();

        Stream<String> strStream = Arrays.stream(new String[]{});
        String[] stringArray = strStream.toArray(String[]::new);
/*
Java program to convert a stream of objects to an array of objects.
 It applies to all Java classes and custom objects as well.
 By default, toArray() will return an Object[].
 To get the String[], we are using the generator function String[]::new that creates an instance of String array.
*/
        Stream<String> strStreams = Arrays.stream(new String[]{});
        String[] stringArrays = strStream.toArray(String[]::new);
      //  JanuaryPractice[] employees = Stream.of(new JanuaryPractice(1, "nagaraju", 1.0, 23,1)).toArray(JanuaryPractice[]::new);


    }
}
