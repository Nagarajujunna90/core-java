package com.example.demo;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = "kseeg";
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        System.out.println(s1Array);
        System.out.println(s2Array);
        // Compare sorted strings
        boolean equals = Arrays.equals(s1Array, s2Array);
        System.out.println(equals);
    }
}
