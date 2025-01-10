package com.example.demo.testtoday;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String[] args) {
        String[] strArray = {"apple", "banana", "mango", "apple", "banana"};

        //1.Occurrences of words count
        Map<String, Long> collect = Stream.of(strArray)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        // System.out.println(collect);

        //2.Remove duplicate words from string array
        String removedDuplicateWords = Arrays.stream(strArray).distinct().collect(Collectors.joining(" "));
        //System.out.println(removedDuplicateWords);

        //3.Get the only duplicate words from String array
        Arrays.stream(strArray).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).
                entrySet().stream().forEach(e -> {
                    if (e.getValue() > 1) {
                       // System.out.println(e.getKey());
                    }
                });

        String charWords = "nagaraju junna";
        //1.Occurrences of words count
        Map<Character, Long> collect1 = charWords.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        // System.out.println(collect1);

        //2.Remove duplicate characters from string
        String removedDuplicatedCharacters = Arrays.stream(charWords.split("")).distinct().collect(Collectors.joining());
        // System.out.println(removedDuplicatedCharacters);

        //3.Get duplicated characters from string
        charWords.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().forEach(e -> {
                    if (e.getValue() > 1) {
                       // System.out.println(e.getKey());
                    }
                });
        //4.Get the chars in ascending order
        String collect2 = Stream.of(charWords).map(c->new StringBuffer(c).reverse()).collect(Collectors.joining());
        //System.out.println(collect2);

        //sorting the String characters in String
        int[] intArray = {1, 2, 3, 4, 4, 4, 5, 5};
        int[] distictValues = Arrays.stream(intArray).distinct().toArray();
      //  System.out.println(Arrays.toString(distictValues));


        Map<Integer, Long> countOfRepeatedValues = Arrays.stream(intArray).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //System.out.println(countOfRepeatedValues);

        String arrays="12345";
        int[] intTab = arrays.chars().map(Character::getNumericValue).toArray();
        int chars = arrays.chars().map(Character::getNumericValue).filter(c->c%2!=0).sum();
        //System.out.println(chars);
        String[] digits = arrays.split("(?<=.)");
        // int sum = Arrays.stream(array.split("")).mapToInt(c->(char)c).sum();
        // System.out.println("------"+digits[0]);

        List<Integer> collect3 = Stream.iterate(1, n -> n + 1).limit(100).filter(s -> s % 5 == 0).collect(Collectors.toList());

        System.out.println(collect3);


        int[] ints={1,3,2,3};
        IntStream stream = Arrays.stream(ints);
        String[] st={"23","32","33","sd"};


    }
}
