package com.dataStructures.Algorithems.programs;

import java.util.Arrays;

public class SumDigitsEx {
    public static void main(String[] args) {
        int[] ints={4, 5, 7, 11, 9, 13, 8, 12,-12, 30};
        int length = ints.length;
        for (int i = 0; i< length; i++){
            for (int j = i+1; j< length; j++){
                if(ints[i]+ints[j]==18){
                    System.out.println(ints[i]+" "+ints[j]);
                }
            }
        }
    }
}
