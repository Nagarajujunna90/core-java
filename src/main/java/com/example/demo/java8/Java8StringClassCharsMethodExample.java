package com.example.demo.java8;

import java.util.stream.Collectors;

public interface Java8StringClassCharsMethodExample {

    public static void main(String[] args) {
        String text = "Hello, World!";

        // Example 1: Print each character on a new line
        text.chars()
                .forEach(c -> System.out.println((char) c));

        // Example 2: Count the number of vowels
        long vowelCount = text.chars()
                .filter(c -> "AEIOUaeiou".indexOf(c) >= 0)
                .count();
        System.out.println("Number of vowels: " + vowelCount);

        // Example 3: Collect characters into a list
        String reversed = text.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println(reversed);
    }
}
