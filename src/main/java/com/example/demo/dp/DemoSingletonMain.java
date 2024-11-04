package com.example.demo.dp;

import com.example.demo.thread.ThreadDemo;
import com.example.demo.thread.ThreadDemo2;

public class DemoSingletonMain {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        System.out.println(singleton);
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton2);
        ThreadDemo threadDemo=new ThreadDemo();
        for (int i = 0; i < 50; i++) {
            Thread thread=new Thread(threadDemo);
            thread.start();
        }

        ThreadDemo2 threadDemo2=new ThreadDemo2();
        for (int i = 0; i < 10000; i++) {
            Thread thread=new Thread(threadDemo2);
            thread.start();

    }

}
}
