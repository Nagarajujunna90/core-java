package com.example.demo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class Course {
    private Integer id;
    private String name;

    private Student student;

    public Course(Integer id, String name, Student student) {
        this.id = id;
        this.name = name;
        this.student = student;
    }

    public static void main(String[] args) {
        Course course=new Course(1,"Java",new Student(2,"nagaraju"));
        Course course2=new Course(2,"CPP",new Student(3,"raj"));
        Course course3=new Course(3,"Oracle",new Student(4,"varun"));
        Course course4=new Course(4,"Java",new Student(5,"Sreedhar"));
        List<Course> list=new ArrayList<>();
        list.add(course);
        list.add(course2);
        list.add(course3);
        list.add(course4);
        list.stream().collect(Collectors.groupingBy(course1 -> course1.getName())).forEach((k,v)-> System.out.println(k+"----"+v));

    }
}
