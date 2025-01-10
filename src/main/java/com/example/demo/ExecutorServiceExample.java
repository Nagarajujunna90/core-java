package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.concurrent.*;

//@EnableAsync
public class ExecutorServiceExample {

    //  @Async


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("hello");

        Callable<String> r = () -> {
            System.out.println("hello");
            return "result";
        };

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> submit = executorService.submit(r);
        //submit.cancel(true);
        System.out.println("Task cancelled");

        System.out.println(submit.get());
        System.out.println(submit.isDone());
        System.out.println(submit.isCancelled());
        System.out.println(submit.cancel(true));
        System.out.println("cancelled-" + submit.isCancelled());

    }
}
