package com.example.demo.java8;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8CountCharInStringUsing {
    public static void main(String[] args) {

                try {
                    Class<?> cls = Class.forName("java.lang.String");

                    // Get the fields
                    Field[] fields = cls.getDeclaredFields();
                    for (Field field : fields) {
                        System.out.println("Field: " + field.getName());
                    }

                    // Get the methods
                    Method[] methods = cls.getDeclaredMethods();
                    for (Method method : methods) {
                        System.out.println("Method: " + method.getName());
                    }

                    // Create an instance
                    Constructor<?> constructor = cls.getConstructor(String.class);
                    Object obj = constructor.newInstance("Hello, World!");

                    // Invoke a method
                    Method lengthMethod = cls.getMethod("length");
                    int length = (int) lengthMethod.invoke(obj);
                    System.out.println("Length: " + length);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }



}
