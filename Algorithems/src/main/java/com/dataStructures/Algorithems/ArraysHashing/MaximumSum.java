package com.dataStructures.Algorithems.ArraysHashing;

import java.util.Queue;

public class MaximumSum {
    public static void main(String[] args) {
        int[] nums={1,5,4,2,9,9,9};
        int sum=0,k=3;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int newSum=sum;
        for(int j=k;j< nums.length;j++){
            sum+=nums[j]-nums[j-k];
            newSum=Math.max(sum,newSum);
        }
        System.out.println(newSum);
    }
}
