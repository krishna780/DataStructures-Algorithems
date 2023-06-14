package com.dataStructures.Algorithems.programs;

import java.util.Arrays;

public class SelectingSortingEx {
    public static void main(String[] args) {
        selectionSort(new int[] {45, 84, 101, 62, 12, 45});

        selectionSort(new int[] {62, -45, 14, 8, -52, 45});

        selectionSort(new int[] {21, 12, 56, -48, 15, 45});
    }

    private static void selectionSort(int[] ints) {

        int temp, pos;
        for(int i=0;i<ints.length-1;i++){
            pos=i;
            for(int j=i+1;j<ints.length;j++){
                if(ints[j]<ints[pos]){
                    pos=j;
                }
            }
            temp=ints[i];
            ints[i]=ints[pos];
            ints[pos]=temp;
        }
        System.out.println(Arrays.toString(ints));
    }
}
