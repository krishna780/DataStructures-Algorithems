package com.dataStructures.Algorithems.practices;

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
        if(target==0){
            System.out.println(list.toString());
            return;
        }
        if(target<0){
            return;
        }
        for(int i:nums){
            list.add(i);
            combinationS(nums,i,target-i,list);
            list.remove(list.size()-1);
        }
    }
}
