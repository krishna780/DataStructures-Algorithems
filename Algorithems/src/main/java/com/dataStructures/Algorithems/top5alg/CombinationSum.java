package com.dataStructures.Algorithems.top5alg;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {


        int[] nums = {2, 3, 4};
        int target = 8,  start=0;
        List<Integer> list=new ArrayList<>();
        combinationS(nums,start, target,list);
    }

    private static void combinationS(int[] nums, int start, int target, List<Integer> list) {
       int sum=0;
        if(target==sum){
            System.out.println(list.toString());
            return;
        }
        if(target<0){
            return;
        }

        for(int i=start;i< nums.length;i++){
            int num = nums[i];
            list.add(num);
            combinationS(nums,i,target-num, list);
            list.remove(list.size()-1);
        }
    }
}