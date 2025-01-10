package com.example.demo.thread;

public class ThreadWithThreadClass extends Thread {
    public static void main(String[] args) {
        System.out.println("hello-"+Thread.currentThread().getName());
        ThreadWithThreadClass threadWithThreadClass =new ThreadWithThreadClass();
        threadWithThreadClass.start();
        threadWithThreadClass.run();
    }

    public void run(){
        System.out.println("Inside run method in another thread "+Thread.currentThread().getName());
    }
}
