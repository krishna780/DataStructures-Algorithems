package com.dataStructures.Algorithems.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums=new int[10];
        Random random =new Random();
        for(int i=0;i<nums.length;i++){
            nums[i]= random.nextInt(10000000);
        }
        quicksort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    private static void quicksort(int[] nums, int left, int right) {

        if(left>=right){
            return;
        }
        int leftOuter=left;
        int rightOuter=right;
        int pivot=nums[right];
        while (leftOuter<rightOuter){
        while (leftOuter<rightOuter && nums[leftOuter]<=pivot) {
            leftOuter++;
          }
            while (leftOuter<rightOuter &&nums[rightOuter]>=pivot) {
                rightOuter--;
            }
          swapNum(nums,leftOuter,rightOuter);
        }
        swapNum(nums,leftOuter, right);
      quicksort(nums, left, leftOuter-1);
      quicksort(nums,  leftOuter+1,right);
    }

    private static void swapNum(int[] nums, int leftOuter, int rightOuter) {
        int num = nums[leftOuter];
        nums[leftOuter]=nums[rightOuter];
        nums[rightOuter]=num;
    }
}
