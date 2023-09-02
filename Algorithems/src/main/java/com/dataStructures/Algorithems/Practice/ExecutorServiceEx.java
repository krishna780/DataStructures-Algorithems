package com.dataStructures.Algorithems.Practice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceEx {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
       ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.execute(new Task(1));
        Future<String> submit = executorService.submit(new CallableTask());
        System.out.println(submit.get());
        executorService.shutdown();
    }
}
