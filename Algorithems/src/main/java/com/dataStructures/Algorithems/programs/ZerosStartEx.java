package com.dataStructures.Algorithems.programs;

import java.util.Arrays;

public class ZerosStartEx {
    public static void main(String[] args) {
        moveZerosToFront(new int[] {12, 0, 7, 0, 8, 0, 3});

        moveZerosToFront(new int[] {1, -5, 0, 0, 8, 0, 1});

        moveZerosToFront(new int[] {0, 1, 0, 1, -5, 0, 4});

        moveZerosToFront(new int[] {-4, 1, 0, 0, 2, 21, 4});
    }

    private static void moveZerosToFront(int[] ints) {

        int count = ints.length, length=0;
        for (int i=0;i<ints.length;i++){
            if(ints[i]!=0){
                ints[length]=ints[i];
                length++;
            }
        }
        int i = count - length;
        while (i>0){
            ints[length]=0;
            length++;
            i--;
        }

        System.out.println(Arrays.toString(ints));
    }
}
