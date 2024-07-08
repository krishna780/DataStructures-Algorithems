package com.dataStructures.Algorithems.top5alg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TargetSum {
    public static void main(String[] args) {
        int[] nums={2,3,4};
        int target =7;
        List<Integer> list=new ArrayList<>();
        targetSum(nums,target,list);
    }

    private static void targetSum(int[] nums, int target, List<Integer> list) {
        if (target==0 && list.size()==3){
            System.out.println(list);
            return;
        }if(target<0){
            return;
        }

        for (int num : nums) {
            list.add(num);
            targetSum(nums, target - num, list);
            list.remove(list.size() - 1);
        }
    }
}
