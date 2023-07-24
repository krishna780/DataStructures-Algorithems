package com.dataStructures.Algorithems.top5alg;

import java.util.ArrayList;
import java.util.List;

public class PermutationEx {
    public static void main(String[] args) {
        int[] nums ={2,3,4};
        boolean[] booleans=new boolean[nums.length];
        List<Integer> list=new ArrayList<>();
        permutationEx(booleans,nums,list);

    }

    private static void permutationEx(boolean[] booleans, int[] nums, List<Integer> list) {
        if(nums.length==list.size()){
            System.out.println(list);
            return;
        }
        for(int i=0;i< nums.length;i++){
            if(!booleans[i]){
                list.add(nums[i]);
                booleans[i]=true;
                permutationEx(booleans,nums,list);
                list.remove(list.size()-1);
                booleans[i]=false;
            }
        }
    }
}
