package com.dataStructures.Algorithems.ArraysHashing;

import java.util.LinkedList;
import java.util.Queue;

public class MaxSumDistictElements {
    public static void main(String[] args) {
        int[] nums={1,5,4,2,9,8,9,7,9};
        int sum=0,k=3, newSum;
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<k;i++){
            int num = nums[i];
            queue.add(num);
            sum+=num;
        }
        newSum=sum;
        for(int i=k;i< nums.length;i++) {
               if(queue.contains(nums[i])){
                   queue.clear();
                   queue.add(nums[i]);
               }
               else {
                   int poll = queue.poll();
                   sum = sum - poll;
                   queue.add(nums[i]);
                   sum += nums[i];
                    newSum = Math.max(sum, newSum);
               }
        }
        System.out.println(newSum);
        }
}
