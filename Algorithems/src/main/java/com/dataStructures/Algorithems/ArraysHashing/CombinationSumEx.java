package com.dataStructures.Algorithems.ArraysHashing;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumEx {
    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 10;
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> integers=new ArrayList<>();
        int start=0;
        combinationsum(candidates,target,start,list ,integers);
        System.out.println(list);
    }

    private static void combinationsum(int[] candidates, int target, int start, List<List<Integer>> list,List<Integer> integers) {
        if(target==0){
            list.add(new ArrayList<>(integers));
            return;
        }if(target<0){
            return;
        }
        for(int i=start;i<candidates.length;i++){
            integers.add(candidates[i]);
            combinationsum(candidates,target-candidates[i],start,list,integers);
            integers.remove(integers.size()-1);
        }
    }
}
