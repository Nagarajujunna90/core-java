package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Comparator.comparingInt;

public class DemoApplication {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<String>();
		stringList.add("raj");
		stringList.add("kumar");
		stringList.add("rajesh");
		stringList.add("varun");
		//stringList.add("varun");

		//stringList.stream().collect(Collectors.toSet()).forEach(s -> System.out.println(s));
		//stringList.stream().collect(Collectors.toList()).forEach(s -> System.out.println(s));
//		Map<String, String> collect = stringList.stream().collect(Collectors.toMap(Function.identity(), s -> s));
//		System.out.println(collect);
//		Map<String, List<String>> collect1 = stringList.stream().collect(Collectors.groupingBy(s -> s));
//		System.out.println(collect1);
	/*	stringList.stream().distinct().collect(Collectors.toList()).forEach(s -> System.out.println(s));
		long count = stringList.stream().count();
		System.out.println(count);*/
		//	stringList.stream().limit(3).collect(Collectors.toList()).forEach(s -> System.out.println(s));
		//SpringApplication.run(DemoApplication.class, args);
	/*	Optional<String> max = stringList.stream().max(Comparator.comparing(s -> s));
		System.out.println(max.get());
		Optional<String> min = stringList.stream().min(Comparator.comparing(s -> s));
		System.out.println(min.get());*/
		//stringList.stream().skip(2).collect(Collectors.toList()).forEach(s -> System.out.println(s));

//		Map<Employee,String> hashMapEx=new HashMap<>();
//		hashMapEx.put(new Employee(1,"nagaraju",1000.0,12),"nagaraju");
//		hashMapEx.put(1,"nagaraju");
//		System.out.println(hashMapEx);


	}

}
