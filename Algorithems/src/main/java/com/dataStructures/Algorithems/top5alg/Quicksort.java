package com.dataStructures.Algorithems.top5alg;

import java.util.Arrays;
import java.util.Random;

public class Quicksort {
    public static void main(String[] args) {
        int[] ints=new int[10];
        Random random=new Random();
        for(int i=0;i< ints.length;i++) {
            ints[i] = random.nextInt(100);
        }
        quickSort(ints,0,ints.length-1) ;
            System.out.println(Arrays.toString(ints));

    }

    private  static void swap(int[] nums, int index1, int index2){
        int temp=nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=temp;
    }
    private static void quickSort(int[] nums, int start, int end) {
        if(start>=end){
            return;
        }

        int pivotIndex=new Random().nextInt(end-start)+start;
         int pivot=nums[pivotIndex];
         swap(nums,pivotIndex,end);
        int leftPointer=start;
         int rightPointer=end;

         while (leftPointer<rightPointer){
             while (nums[leftPointer]<=pivot && leftPointer<rightPointer){
                 leftPointer++;
             }
             while (nums[rightPointer]>=pivot && leftPointer<rightPointer){
                 rightPointer--;
             }
             swap(nums,leftPointer,rightPointer);
         }
          swap(nums,leftPointer,end);
         quickSort(nums,start,leftPointer-1);
        quickSort(nums,leftPointer+1,end);
    }
}
