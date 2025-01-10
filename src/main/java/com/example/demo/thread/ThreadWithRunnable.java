package com.example.demo.thread;

import com.example.demo.dp.ThreadDemo;

import javax.annotation.security.RunAs;
import java.util.concurrent.CompletableFuture;

public class ThreadWithRunnable implements Runnable{
    public static void main(String[] args) {

        ThreadWithRunnable threadWithRunnable=new ThreadWithRunnable();
//        Thread thread=new Thread(threadWithRunnable);
//        thread.start();
//        threadWithRunnable.run();
        Runnable r=()-> System.out.println("Inside run method new thread "+Thread.currentThread().getName());
        Thread threadDemo=new Thread(r);
        threadDemo.start();

        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.runAsync(r);
        System.out.println(voidCompletableFuture);

        CompletableFuture<String> su = CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello from supply async");
            return "result";
        });
        System.out.println(su);
    }

    @Override
    public void run() {
        System.out.println("Inside run method new thread "+Thread.currentThread().getName());
    }
}
