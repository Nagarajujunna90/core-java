package com.example.demo.defaultStaticInterfaces;

public interface A {
    public  void hello();
    default  public void commonMethod(){
        System.out.println("A");
    }
}
