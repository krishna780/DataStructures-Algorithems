package com.dataStructures.Algorithems.sort;

import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] intArray={20,35,-15,7,55,1,-22};
        for(int i=intArray.length-1;i>0;i--){
            for (int j=0;j<i;j++){
                if(intArray[j]>intArray[j+1]){
                    swap(intArray,j,j+1);
                }
            }
        }
        Arrays.stream(intArray).forEach(System.out::println);
    }

    private static void swap(int[] intArray, int j, int i) {
        if(intArray[i]==intArray[j]){
            return;
        }
        int temp;
        temp=intArray[j];
        intArray[j]=intArray[i];
        intArray[i]=temp;
    }
}
