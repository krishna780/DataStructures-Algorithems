package com.dataStructures.Algorithems.programs;

import java.util.Arrays;

public class MoveZerosBegin {
    public static void main(String[] args) {
        moveZerosToFront(new int[] {12, 0, 7, 0, 8, 0, 3});

        moveZerosToFront(new int[] {1, -5, 0, 0, 8, 0, 1});

        moveZerosToFront(new int[] {0, 1, 0, 1, -5, 0, 4});

        moveZerosToFront(new int[] {-4, 1, 0, 0, 2, 21, 4});
    }

    private static void moveZerosToFront(int[] ints) {
        int count = ints.length-1;

        for(int i= ints.length-1;i>=0;i--){
            if(ints[i]!=0){
                ints[count]=ints[i];
                count--;
            }
        }
        while (count>=0){
            ints[count]=0;
            count--;
        }
        System.out.println(Arrays.toString(ints));
}
}
