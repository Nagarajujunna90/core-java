package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
public class ServiceExample {
    @Bean(name = "executorConfig")
    private ExecutorService executorConfig(Runnable r) {
        return Executors.newFixedThreadPool(2);
    }
}
