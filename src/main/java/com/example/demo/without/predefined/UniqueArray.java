package com.example.demo.without.predefined;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UniqueArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 2, 7, 8, 8, 3};
        Stream<int[]> arr1 = Stream.of(arr);
        arr1.distinct().collect(Collectors.toList());

        System.out.println("Unique elements in given array: ");
        for (int i = 0; i < arr.length; i++) {
            boolean isDistinct = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDistinct = true;
                    break;
                }
            }
            if (!isDistinct) {
                System.out.println(arr[i]);
            }
        }
    }
}
