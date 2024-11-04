package com.example.demo.java8;

import java.util.stream.IntStream;

public class Java8RangeVsClosed {
    public static void main(String[] args) {
        IntStream intStream2 = IntStream.of(10);//10
        IntStream intStream1 = IntStream.of(1, 2, 3);//1,2,3

        //range vs rangeClosed
        IntStream range = IntStream.range(1, 5);//1,2,3,4
        IntStream intStream = IntStream.rangeClosed(1, 5);//1,2,3,4,5

        IntStream.rangeClosed(1,10).map(i->i*2).forEach(System.out::println);

    }
}
