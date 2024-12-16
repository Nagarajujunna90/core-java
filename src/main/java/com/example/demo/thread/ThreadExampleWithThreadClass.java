package com.example.demo.thread;

public class ThreadExampleWithThreadClass extends Thread {
    public static void main(String[] args) {
        System.out.println("hello-"+Thread.currentThread().getName());
        ThreadExampleWithThreadClass threadExampleWithThreadClass=new ThreadExampleWithThreadClass();
        threadExampleWithThreadClass.start();
        threadExampleWithThreadClass.run();
    }

    public void run(){
        System.out.println("Inside run method in another thread "+Thread.currentThread().getName());
    }
}
