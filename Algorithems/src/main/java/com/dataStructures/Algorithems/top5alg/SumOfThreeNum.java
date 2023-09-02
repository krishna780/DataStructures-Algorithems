package com.dataStructures.Algorithems.top5alg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfThreeNum {
    public static void main(String[] args) {
        int[] ints={1,5,4,2,9,9,9};
          int target=15;
           Arrays.sort(ints);
          sumofThreeNumbers(ints,target);
    }

    private static void sumofThreeNumbers(int[] ints, int target) {
        List<Integer[]> list=new ArrayList<>();
        for(int i=0;i< ints.length;i++) {
            int left=i+1, right= ints.length-1;
            while (left<right){
                int sum=ints[i]+ints[right]+ints[left];
                if(sum==target){
                    list.add(new Integer[]{ints[i], ints[right],ints[left]});
                    left++; right--;
                } else if (sum<target) {
                    left++;
                }else {
                    right--;
                }
            }

        }
   list.stream().forEach(s-> System.out.println(Arrays.toString(s)));
    }
}
