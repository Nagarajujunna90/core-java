package com.example.demo.defaultStaticInterfaces;

public interface B {
    public  void hello();
    default  public void commonMethod(){
        System.out.println("hello");
    }
}
