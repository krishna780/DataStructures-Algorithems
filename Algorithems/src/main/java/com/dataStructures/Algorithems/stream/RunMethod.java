package com.dataStructures.Algorithems.stream;

public class RunMethod implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

        try {
            Thread.sleep(1000);
            System.out.println("welcome");
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
