package com.example.demo.thread;

public class MultipleThreadsUsingThreadClass implements Runnable {
    public static void main(String[] args) {
        MultipleThreadsUsingThreadClass multipleThreadsUsingThreadClass = new MultipleThreadsUsingThreadClass();
        Thread thread=new Thread(multipleThreadsUsingThreadClass);
        thread.start();
//       Below is if we extend Thread class
//        MultipleThreadsUsingThreadClass multipleThreadsUsingThreadClass2 = new MultipleThreadsUsingThreadClass();
//        multipleThreadsUsingThreadClass2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("new thread " + i + "---" + Thread.currentThread().getName());

        }
    }
}
