package com.dataStructures.Algorithems.programs;

public class ReverseNum {
    public static void main(String[] args) {
        int i=1234, temp = 0;

        while (i!=0){
           int k= i%10;
           temp=temp*10+k;
           i=i/10;
        }
        System.out.println(temp);
    }
}
