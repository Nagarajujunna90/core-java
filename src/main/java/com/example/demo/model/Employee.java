package com.example.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;
import java.util.stream.*;
@NoArgsConstructor
@Data
public class Employee implements Comparable<Employee>{
    private  Integer id;
    private String name;
    private Double salary;

    private Integer age;

    private Department department;

    public Employee(Integer id, String name, Double salary, Integer age, Department mathematics) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.department=mathematics;
    }
    public Employee(Integer id, String name, Double salary, Integer age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }


    @Override
    public int compareTo(Employee employee) {
        return this.getAge().compareTo(employee.getAge());
    }


    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "nagaraju", 40000.0, 40,new Department(1,"mathematics"));
        Employee emp2 = new Employee(2, "raju", 50000.0, 30,new Department(2,"science"));
        Employee emp3 = new Employee(3, "kumar", 30000.0, 20,new Department(3,"social"));
        Employee emp4 = new Employee(4, "vinod", 30000.0, 50,new Department(1,"mathematics"));
        Employee emp5 = new Employee(5, "rajesh", 20000.0, 50,new Department(2,"science"));

        List<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp5);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);


        int[] in=new int[]{10,11,12,43};
        long[] ln=new long[]{10,32,42,4};
        double[] db=new double[]{12.3,2.2,12.2,2};
        String[] stingArg=new String[]{"Pen","Pencil","Pen","Notebook"};

        String text = "Hello, World!";

        // Converting to lowercase
        String lowercaseText = text.chars()
                .mapToObj(c -> (char) c)
                .map(Character::toLowerCase)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        System.out.println(lowercaseText);

        Stream<Double> randomNumbers = Stream.generate(Math::random);
        // Limiting the stream to 5 elements and printing them
       // randomNumbers.limit(5).forEach(System.out::println);
        Stream<Integer> infiniteEvenNumbers = Stream.iterate(0, n -> n + 2).limit(10);
        infiniteEvenNumbers.forEach(System.out::println);

        Stream<ArrayList> empty = Stream.empty();
        // String lowercaseText = (String) collect2;

//        IntStream stream = Arrays.stream(in);
//        LongStream stream2 = Arrays.stream(ln);
//        DoubleStream stream3 = Arrays.stream(db);
//        Stream<String> stream4 = Arrays.stream(stingArg);
//
//        Stream<int[]> in1 = Stream.of(in);
//        Stream<long[]> ln1 = Stream.of(ln);
//        Stream<double[]> db1 = Stream.of(db);
//        Stream<String> stream41 = Stream.of(stingArg);
//        Stream<String> stingArg2 = Stream.of("Pen","Pencil","Pen");
//        Stream<String[]> stingArg1 = Stream.of(stingArg,new String[]{});
//
//        //Convert Stream to Arrays:
//        IntStream intStream = Arrays.stream(new int[]{1,2,3});
//        int[] primitiveArray = intStream.toArray();
//
//        //Java program to convert a stream of Integers to primitive int array.
//        // Note that mapToInt() returns an instance of IntStream type.
//        // And IntStream.toArray() returns an int[]. This is the reason we are not using any generator function.
//        Stream<Integer> integerStream = Arrays.stream(new Integer[]{1,2,3});
//        int[] primitivesArray = integerStream.mapToInt(i -> i).toArray();
//
//        Stream<String> strStream = Arrays.stream(new String[]{});
//        String[] stringArray = strStream.toArray(String[]::new);
//        //Java program to convert a stream of objects to an array of objects.
//        // It applies to all Java classes and custom objects as well.
//        // By default, toArray() will return an Object[].
//        // To get the String[], we are using the generator function String[]::new that creates an instance of String array.
//        Stream<String> strStreams = Arrays.stream(new String[]{});
//
//        String[] stringArrays = strStream.toArray(String[]::new);
//        Employee[] employees = list.stream().toArray(Employee[]::new);
//


//        Map<String, Long> collect = stingArg1.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(collect);

//        List<String> collect2 = stingArg1.distinct().collect(Collectors.toList());
//        System.out.println(collect2);

//        String p = stingArg1.filter(t -> t.startsWith("P")).collect(Collectors.joining(" "));
//        System.out.println(p);

//        Map<String, Long> collect = stingArg1.distinct().filter(t -> t.startsWith("P")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(collect);


//        Map<String,List<Employee>> mapEmp=list.stream().collect(Collectors.groupingBy(e->e.getName()));
//        System.out.println(mapEmp);

       // Map<Department, Long> collect = list.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
//        Map<Integer, Optional<Employee>> collect1 = list.stream().collect(Collectors.groupingBy(Employee::getAge, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
//        collect1.forEach((k,v)-> System.out.println(k+""+v));

        //Intermediate operations
         /*
        list.stream().collect(Collectors.toList()).forEach(employee -> System.out.println(employee));
        list.stream().collect(Collectors.toSet()).forEach(employee -> System.out.println(employee));
        list.stream().collect(Collectors.toMap(employee -> employee.getName(),employee -> employee.getAge())).forEach((k,v)-> System.out.println(k+"----"+v));
        list.stream().sorted().collect(Collectors.toList()).forEach(s-> System.out.println("sorted-----"+s));
        list.stream().sorted(Comparator.comparing(employee -> employee.getSalary())).collect(Collectors.toList()).forEach(s-> System.out.println("Salary sorted-----"+s));
        list.stream().distinct().collect(Collectors.toList()).forEach(s-> System.out.println("distinct--"+s));
        list.stream().limit(2).collect(Collectors.toList()).forEach(s-> System.out.println("limit-----"+s));
        list.stream().skip(4).collect(Collectors.toList()).forEach(s-> System.out.println("skip-----"+s));
        list.stream().map(employee -> employee.getName().toUpperCase()).peek(s-> System.out.println("peek -"+s)).collect(Collectors.toList()).forEach(s-> System.out.println("peek-----"+s));
        //terminal operations
        list.stream().forEach(s-> System.out.println("for order-no guarantee order in this----"+s));
        list.stream().parallel().forEachOrdered(s-> System.out.println("for each order used for maintain order in parallel stream----"+s));
        System.out.println("max salary of employee "+list.stream().max(Comparator.comparing(employee -> employee.getSalary())).get());
        System.out.println("min age of employee "+list.stream().min(Comparator.comparing(employee -> employee.getAge())).get());
        Boolean aBoolean = list.stream().map(employee -> employee.getSalary() > 100000).findAny().get();
        System.out.println(aBoolean);
        Boolean first = list.stream().map(employee -> employee.getSalary() > 30000).findFirst().get();
        System.out.println(first);
        Boolean noneMatch = list.stream().noneMatch(employee -> employee.getSalary() > 30000);
        System.out.println(noneMatch);
        Boolean anyMatch = list.stream().anyMatch(employee -> employee.getSalary() > 30000);
        System.out.println(anyMatch);
        Boolean allMatch = list.stream().allMatch(employee -> employee.getSalary() > 30000);
        System.out.println(allMatch);

        int[] a={10,30,40,20,5};
        Arrays.stream(a).boxed().collect(Collectors.toList()).forEach(System.out::println);
        Stream.of(a).collect(Collectors.toList()).forEach(System.out::println);
*/

//        int[] a={10,30,40,20,5};
//       // Arrays.stream(a).boxed().collect(Collectors.toList()).forEach(System.out::println);
//        Stream.of(a).collect(Collectors.toList()).forEach(System.out::println);
//
//        List<Integer> integerList1 = Arrays.asList(1);
//        List<Integer> integerList2 = Arrays.asList(2, 3);
//        List<List<Integer>> result = Stream.of(integerList2, integerList2)
//                .collect(Collectors.toList());
//        System.out.println(result);//[[1], [2, 3]]
//
//        List<Integer> result2 = Stream.of(integerList2, integerList2)
//                .flatMap(i -> i.stream())
//                .collect(Collectors.toList());
//        System.out.println(result2);//[1, 2, 3]
//
//
    }

}

class AgeComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee employee,Employee employee2){
        return employee.getSalary().compareTo(employee2.getSalary());
    }
}
