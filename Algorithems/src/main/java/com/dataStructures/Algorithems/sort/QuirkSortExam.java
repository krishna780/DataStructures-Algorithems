package com.dataStructures.Algorithems.sort;

import java.util.Arrays;

public class QuirkSortExam {
    public static void main(String[] args) {
        int[] intArray={20,35,-15,7,55,1,-22};
        quirkSort(intArray, 0,intArray.length);
        Arrays.stream(intArray).forEach(System.out::println);

    }

    public static void quirkSort(int[] input,int start, int end){
        if(end-start<2){
            return;
        }
        int pivotIndex=partion(input,start,end);
        quirkSort(input, start, pivotIndex);
        quirkSort(input, pivotIndex+1, end);
    }

    private static int partion(int[] input, int start, int end) {
        int pivot=input[start];
        int i=start;
        int j=end;
        while (i<j) {
            while (i < j && input[--j] >= pivot) ;
            if(i<j){
                input[i] = input[j];
            }
            while (i < j && input[++i] <= pivot) ;
            if (i<j){
                input[j] = input[i];
            }
        }
        input[j]=pivot;
        return j;
        }

}
