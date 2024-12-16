package com.example.demo.thread;

import com.example.demo.dp.ThreadDemo;

import javax.annotation.security.RunAs;

public class ThreadWithRunnable implements Runnable{
    public static void main(String[] args) {

        ThreadWithRunnable threadWithRunnable=new ThreadWithRunnable();
//        Thread thread=new Thread(threadWithRunnable);
//        thread.start();
//        threadWithRunnable.run();
       Runnable r=()-> System.out.println("Inside run method new thread "+Thread.currentThread().getName());
        Thread threadDemo=new Thread(r);
        threadDemo.start();
    }

    @Override
    public void run() {
        System.out.println("Inside run method new thread "+Thread.currentThread().getName());
    }
}
