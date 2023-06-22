package com.dataStructures.Algorithems.ArraysHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums={-1,0,1,-1,-4,2};
        int target =0 ;
        List<Integer[]> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum=nums[i] + nums[left] + nums[right];
                if (sum== target) {
                    result.add(new Integer[] { nums[i], nums[left], nums[right] });
                    left++; right--;
                } else if (sum< target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
      for (Integer[] l:result){
          System.out.println(Arrays.toString(l));
           }
        }
    }
