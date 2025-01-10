package com.example.demo.defaultStaticInterfaces;

public class C implements A, B {
    @Override
    public void hello() {
        System.out.println("hello");
    }

    @Override
    public void commonMethod() {
        B.super.commonMethod();
    }

    private static String name = "staticVariable";

    static {
        name="raj";
        System.out.println("static block");
    }

    public static void main(String[] args) {
        C c = new C();
        c.commonMethod();
        System.out.println(name);
    }
}
