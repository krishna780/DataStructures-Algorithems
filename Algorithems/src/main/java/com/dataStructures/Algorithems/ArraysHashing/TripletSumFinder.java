package com.dataStructures.Algorithems.ArraysHashing;

import java.util.HashMap;
import java.util.Map;

public class TripletSumFinder {
    public static void main(String[] args) {
        int[] nums={-1,0,1,-1,-4,2};
        int length= nums.length;
        int target =0 ;
      for (int i=0;i<length-2;i++){
          int currentTarget = target - nums[i];
          Map<Integer, Integer> seenMap = new HashMap<>();
          for(int j=i+1;j< length;j++){
              int con = currentTarget - nums[j];
              if(seenMap.containsKey(con)){
                  System.out.println(nums[i]+" "+ con+" "+nums[j]);
              }
              seenMap.put(nums[j], j);
          }
      }
    }
}
