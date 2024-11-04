package com.example.demo.java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Java8FlatMapExampleParcel {
    String name;
    List<String> items;

    public Java8FlatMapExampleParcel(String name, String... items) {
        this.name = name;
        this.items = Arrays.asList(items);
    }

    public List<String> getItems() {
        return items;
    }

    public static void main(String[] args) {
        Java8FlatMapExampleParcel amazon = new Java8FlatMapExampleParcel("amazon", "Laptop", "Phone");
        Java8FlatMapExampleParcel ebay = new Java8FlatMapExampleParcel("ebay", "Mouse", "Keyboard");
        List<Java8FlatMapExampleParcel> parcels = Arrays.asList(amazon, ebay);

        System.out.println("-------- Without flatMap() ---------------------------");
        List<List<String>> mapReturn = parcels.stream()
                .map(Java8FlatMapExampleParcel::getItems)
                .collect(Collectors.toList());
        System.out.println("\t collect() returns: " + mapReturn);

        System.out.println("\n-------- With flatMap() ------------------------------");
        List<String> flatMapReturn = parcels.stream()
                .map(Java8FlatMapExampleParcel::getItems)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println("\t collect() returns: " + flatMapReturn);
    }
}