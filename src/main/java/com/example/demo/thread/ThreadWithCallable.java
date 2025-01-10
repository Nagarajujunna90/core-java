package com.example.demo.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadWithCallable implements Callable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadWithCallable threadWithCallable = new ThreadWithCallable();
//        Thread thread=new Thread(threadWithCallable);// threadWithCallable as Runnable impl not allowed directly so we need futureTask object or ExecutorService
//        thread.start();
        FutureTask futureTask = new FutureTask(threadWithCallable);
        Thread thread = new Thread(futureTask);
        thread.start();
        System.out.println(futureTask.get());

    }

    @Override
    public Object call() throws Exception {
        return "Hello Object from Call method " + Thread.currentThread().getName();
    }
}
