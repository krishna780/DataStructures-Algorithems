package com.dataStructures.Algorithems.stream;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor {

    public static void main(String[] args) {
        RunMethod runMethod=new RunMethod();
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        executorService.submit(runMethod)    ;
        executorService.submit(runMethod)    ;



    }
}
