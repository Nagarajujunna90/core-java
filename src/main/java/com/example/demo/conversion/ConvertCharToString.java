package com.example.demo.conversion;

import java.util.Arrays;

public class ConvertCharToString {
    public static void main(String[] args) {
        char d = 'c';
        String s = String.valueOf(d);
        System.out.println(s);
        String string = Character.toString(d);
        System.out.println(string);

        String[] strArray = {string};
        System.out.println(Arrays.toString(strArray));

        //convert char[] to string object
        char[] chars = {'a', 'b', 'c', 'd'};
        String s1 = "";
        for (char e : chars) {
            s1 = s1 + e;
        }
        System.out.println(s1);

        //convert char[] to string[]
        String[] stringss = new String(chars).split("");
        System.out.println(stringss);

        String[] strings = new String[chars.length];
        int index = 0;
        for (char f : chars) {
            strings[index++] = Character.toString(f);
        }
        System.out.println(Arrays.toString(strings));

        //another approach





        //using streams: char[] to string[]


    }
}
