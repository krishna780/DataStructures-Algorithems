package com.dataStructures.Algorithems.Practice;

public class Task extends Thread{
    public int num;

    public Task(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.print("\nTask "+num+"Started");
        for(int i=num*100;i<num+100+99;i++){
            System.out.print(Thread.currentThread().getName()+" "+i+" ");
        }
    }
}
