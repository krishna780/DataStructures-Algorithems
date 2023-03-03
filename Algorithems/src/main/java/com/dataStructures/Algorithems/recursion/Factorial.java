package com.dataStructures.Algorithems.recursion;

public class Factorial {
    public static void main(String[] args) {
        int n= factorial(5);
        System.out.println(n);
    }

    private static int factorial(int i) {
        if(i==0){
            return 1;
        }
        return i*factorial(i-1);
    }
}
