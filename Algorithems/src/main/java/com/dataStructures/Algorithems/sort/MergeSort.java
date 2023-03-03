package com.dataStructures.Algorithems.sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] intArray={20,35,-15,7,55,1,-22};
        int start = 0,end= intArray.length;
         merge(intArray,  start, end);

         Arrays.stream(intArray).forEach(System.out::println);

    }

    private static void merge(int[] intArray, int start, int end) {
    if(end-start<2){
        return;
    }
    int mid=(start+end)/2;
    merge(intArray,start,mid);
    merge(intArray,mid,end);
    merging(intArray,start,mid,end);
    }

    private static void merging(int[] intArray, int start, int mid, int end) {
        int i1 = intArray[mid - 1];
        int i2 = intArray[mid];
        if(i1<=i2){
         return;
     }
     int tempIndex=0;
     int i=start;
     int j=mid;
     int [] temp=new int[end-start];
     while (i<mid&&j<end){
         temp[tempIndex++]=intArray[i]<=intArray[j]?intArray[i++]:intArray[j++];
     }
    System.arraycopy(intArray,i,intArray,start+tempIndex,mid-i);
     System.arraycopy(temp,0,intArray,start,tempIndex);
    }
}
