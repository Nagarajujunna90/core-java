package com.example.demo.testing;

import com.example.demo.EmployeeWithStringDepartment;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JanuaryPractice {
    public static void main(String[] args) {
        List<EmployeeWithStringDepartment> employeeList = Arrays.asList(
                new EmployeeWithStringDepartment(1, "nagaraju", 3200.2, "Male", 24, "IT"),
                new EmployeeWithStringDepartment(2, "Junna", 300.2, "Female", 38, "HR"),
                new EmployeeWithStringDepartment(3, "Advika", 200.2, "Male", 21, "Finance"),
                new EmployeeWithStringDepartment(2, "ayansh", 200.2, "Male", 4, "HR"));


        //How many male and female employees are there in the organization
        Map<String, Long> genderCount = employeeList.stream().collect(Collectors.groupingBy(EmployeeWithStringDepartment::getGender, Collectors.counting()));
        // System.out.println(genderCount);
        //Print the name of all departments in the organization?
        // employeeList.stream().map(EmployeeWithStringDepartment::getDepartment).forEach(System.out::println);
        //>	What is the average age of male and female employees?
        Map<String, Double> averageAgeOfGender = employeeList.stream().collect(Collectors.groupingBy(EmployeeWithStringDepartment::getGender, Collectors.averagingInt(EmployeeWithStringDepartment::getAge)));
        // System.out.println(averageAgeOfGender);
        //>	Get the details of highest paid employee in the organization?
        EmployeeWithStringDepartment employeeWithStringDepartment = employeeList.stream().max(Comparator.comparingDouble(EmployeeWithStringDepartment::getSalary)).get();
        // System.out.println(employeeWithStringDepartment);
        //>	Get the names of all employees who havejoined after 2015?
        //>	Count the number of employees in each department?
        Map<String, Long> collect = employeeList.stream().collect(Collectors.groupingBy(EmployeeWithStringDepartment::getDepartment, Collectors.counting()));
        //  System.out.println(collect);
        //>	What is the average salary of each department?
        Map<String, Double> averageSalaryOfEachDepartment = employeeList.stream().collect(Collectors.groupingBy(EmployeeWithStringDepartment::getDepartment, Collectors.averagingDouble(EmployeeWithStringDepartment::getSalary)));
        //System.out.println(averageSalaryOfEachDepartment);
        //>	Get the details of youngest male employee in the product development department?
        EmployeeWithStringDepartment youngestEmpInDept = employeeList.stream().filter(emp -> emp.getDepartment().equals("HR")).min(Comparator.comparingInt(EmployeeWithStringDepartment::getAge)).get();
        //  System.out.println(youngestEmpInDept);
        //>	How many male and female employees are there in the sales and marketing team?
        Map<String, Long> departBasedGenderCount = employeeList.stream().filter(emp -> emp.getDepartment().equalsIgnoreCase("HR")).collect(Collectors.groupingBy(EmployeeWithStringDepartment::getGender, Collectors.counting()));
        //  System.out.println(departBasedGenderCount);
        //>	What is the average salary of male and female employees?
        Map<String, Double> averageSalaryOfGender = employeeList.stream().collect(Collectors.groupingBy(EmployeeWithStringDepartment::getGender, Collectors.averagingDouble(EmployeeWithStringDepartment::getSalary)));
        // System.out.println(averageSalaryOfGender);
        //>	List down the names of all employees in each department?
        Map<String, List<String>> namesWithDepartment = employeeList.stream().collect(Collectors.groupingBy(EmployeeWithStringDepartment::getDepartment, Collectors.mapping(EmployeeWithStringDepartment::getName, Collectors.toList())));
        // System.out.println(namesWithDepartment);
        //>	What is the average salary and total salary of the whole organization?
        DoubleSummaryStatistics summaryStatisticsOfSalary = employeeList.stream().collect(Collectors.summarizingDouble(EmployeeWithStringDepartment::getSalary));
        // System.out.println(summaryStatisticsOfSalary.getSum());
        //>	Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years?
        Map<Boolean, List<EmployeeWithStringDepartment>> ageSeparated = employeeList.stream().collect(Collectors.partitioningBy(emp -> emp.getAge() <= 25));
        /*ageSeparated.forEach((k, v) -> {
            if (k) {
                System.out.println("age is less than 25" + v);
            } else {
                System.out.println("age is greater than 25" + v);
            }
        });*/
        //>	Who is the oldest employee in the organization? What is his age and which department hebelongs to?
        //    employeeList.stream().max(Comparator.comparingInt(EmployeeWithStringDepartment::getAge)).ifPresent(System.out::println);


        //Find the occurrences/frequency of characters in String using java8?
        String s = "nagaraju";
        Map<Character, Long> occurencesOfCharacters = s.chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        // System.out.println(occurencesOfCharacters);

        String words = "naga raju junna raju nagaraju";
        //Find the duplicates words count in String array using java8?
        String[] split = words.split(" ");
        Map<String, Long> collect1 = Arrays.stream(split).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Set<Map.Entry<String, Long>> entries = collect1.entrySet();
        for (Map.Entry<String, Long> entrie : entries) {
            if (entrie.getValue() > 1) {
                //      System.out.println(entrie);
            }
        }

        // System.out.println(collect1);

        //Find the occurrences of words in string array using java8?
        Map<String, Long> raju = Arrays.stream(split).filter(ss -> ss.equals("raju")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //System.out.println(raju);

//Find the duplicates word in String array using java8?
        Set<String> stringSet = new HashSet<>();
        // Arrays.stream(split).filter(shs -> !stringSet.add(shs)).forEach(System.out::println);
//Remove the duplicates words from string array using java8?
        //Arrays.stream(words.split(" ")).distinct().forEach(System.out::println);

        List<Integer> integerList = Arrays.asList(1, 19, 12, 1, 2, 3, 2, 4);
//Find the duplicates numbers in Integer/int array using java8?
        Set<Integer> setInt = new HashSet<>();
        // integerList.stream().filter(hs -> !setInt.add(hs)).forEach(System.out::println);
//Separate odd and even numbers from Integer/int array using java8?

        Map<Boolean, List<Integer>> evenAndOddGroup = integerList.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        // System.out.println(evenAndOddGroup);
//Second-largest number from given array?
//integerList.stream().sorted(Comparator.reverseOrder()).limit(1).forEach(System.out::println);
//Sum of first 10 natural numbers?
        //    IntStream.rangeClosed(1,10).forEach(System.out::println);
        //Find String which start with word "na"?
        String[] strings = Arrays.stream(split).filter(k -> k.startsWith("na")).toArray(String[]::new);
        //  System.out.println(Arrays.toString(strings));

        //first and last element of  integer array?
        Integer firstElement = integerList.stream().findFirst().get();
        Integer lastElement = integerList.stream().reduce((x, y) -> y).get();
        // System.out.println(firstElement+""+lastElement);
//Sort the list of string in increasing order of their length?

        //Arrays.stream(split).sorted(Comparator.comparing(String::length)).forEach(System.out::println);
//Min or max 3 numbers from integers?
        //      integerList.stream().sorted().limit(3).forEach(System.out::println);

        //Merge unsorted arrays into single Sorted array?
        String stringArray2 = "nagaraju,rajesh,mahesh";
        String[] split1 = stringArray2.split(",");
        Stream<String> concat = Stream.concat(Arrays.stream(split), Arrays.stream(split1));
        //concat.sorted().forEach(System.out::println);
        // Sort the list in reverse order?
//        employeeList.stream().forEach(sp->{
//            System.out.println(sp+" "+sp.hashCode());
//        });
//        input: ["apple","banana","pear","kiwi"]
//        Expected output:
//        4=[pear,kiwi] , 5=[apple],6=[banana]

        String[] str = {"apple", "banana", "pear", "kiwi"};
        Map<Integer, List<String>> longMap = Arrays.stream(str).collect(Collectors.groupingBy(String::length, Collectors.toList()));
//        System.out.println(longMap);
        Map<Integer, String> integerStringMap = Arrays.stream(str).collect(Collectors.groupingBy(bb -> bb.length(), Collectors.joining(",")));
        //      System.out.println(integerStringMap);

//        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 17};
//
//         Arrays.stream(a).boxed().reduce(0,(p,q)->p+q,Integer::sum);
//        System.out.println(reduce);
        String sumOfString="12345";

        int sum = sumOfString.chars().map(Character::getNumericValue).filter(hh -> hh % 2 != 0).sum();
        //System.out.println(sum);

        //What will be the result of duplicate if dont oveeride hashCode
        String s2=new String("raj");
        String s3=new String("raj");
        Integer i1=Integer.valueOf(12);
        Integer i2=Integer.valueOf(12);
//        EmployeeWithStringDepartment employeeWithStringDepartment1 = new EmployeeWithStringDepartment(1, "nagaraju", 3200.2, "Male", 24, "IT");
//        EmployeeWithStringDepartment employeeWithStringDepartment2 = new EmployeeWithStringDepartment(1, "nagaraju", 3200.2, "Male", 24, "IT");
//        HashSet<EmployeeWithStringDepartment> hashSet=new HashSet<>();
//        hashSet.add(employeeWithStringDepartment1);
//        hashSet.add(employeeWithStringDepartment2);
//
//        System.out.println(hashSet.size());


    }


}
