package com.example.demo.thread;

import com.example.demo.dp.Singleton;

public class ThreadDemo2 implements Runnable{
    @Override
    public void run() {
        Singleton singleton=Singleton.getSingleton();
        System.out.println(singleton+"------"+Thread.currentThread().getName());
    }
}
