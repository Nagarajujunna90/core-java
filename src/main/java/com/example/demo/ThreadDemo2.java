package com.example.demo;

public class ThreadDemo2 implements Runnable{
    @Override
    public void run() {
        Singleton singleton=Singleton.getSingleton();
        System.out.println(singleton+"------"+Thread.currentThread().getName());
    }
}
