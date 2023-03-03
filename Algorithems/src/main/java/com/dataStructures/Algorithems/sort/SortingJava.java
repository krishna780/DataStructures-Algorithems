package com.dataStructures.Algorithems.sort;

import java.util.Arrays;

public class SortingJava {
    public static void main(String[] args) {
        int[] intArray={20,35,-15,7,55,1,-22};
        int temp;
    for(int i=0;i<intArray.length-1;i++){
        for (int j=i+1;j< intArray.length;j++){
            if(intArray[i]>intArray[j]){
                temp=intArray[i];
                intArray[i]=intArray[j];
                intArray[j]=temp;
            }
        }
    }
    Arrays.stream(intArray).forEach(System.out::println);
    }
}
