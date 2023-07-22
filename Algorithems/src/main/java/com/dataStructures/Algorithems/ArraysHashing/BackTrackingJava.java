package com.dataStructures.Algorithems.ArraysHashing;

import java.util.ArrayList;
import java.util.List;

public class BackTrackingJava {
    public static void main(String[] args) {
        int[] nums={2,3,5}; int target=8, start=0;
        List<List<Integer>> lists=new ArrayList<>();
        List<Integer> integers=new ArrayList<>();
        getCombinations(nums, target, start, lists,integers);
        System.out.println(lists);
    }

    private static void getCombinations(int[] nums, int target, int start,
                                        List<List<Integer>> lists , List<Integer> integers) {
        if(target==0){
            lists.add(new ArrayList<>(integers));
            return;
        }
        if (target<0){
            return;
        }
         for (int i=start;i< nums.length;i++){
           integers.add(nums[i]);
            getCombinations(nums,target-nums[i], start,lists,integers);
            integers.remove(integers.size()-1);
        }
    }
}
