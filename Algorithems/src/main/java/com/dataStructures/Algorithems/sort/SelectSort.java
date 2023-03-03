package com.dataStructures.Algorithems.sort;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] intArray={20,35,-15,7,55,1,-22};
       for(int i= intArray.length-1;i>0;i--){
           int select = 0;
          for (int j=1;j<= i;j++){
              if(intArray[j]>intArray[select]){
                  select=j;
              }
          }
           swap(intArray, select,i);
       }
       Arrays.stream(intArray).forEach(System.out::println);
    }

    private static void swap(int[] ar, int i, int j) {
        if(i==j){
            return;
        }
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }
}
