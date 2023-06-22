package com.dataStructures.Algorithems.ArraysHashing;

public class TrappingWater {
    public static void main(String[] args) {
      int[] nums= {0,1,0,2,1,0,1,3,2,1,2,1};
     int l=0, r= nums.length-1, maxLeft= nums[l], maxRight=nums[r], res = 0;

     while (l<r){
         if(maxLeft<maxRight){
             l++;
            maxLeft =Math.max(maxLeft,nums[l]);
            res+=maxLeft-nums[l];
         }
         else{
             r--;
             maxRight =Math.max(maxRight,nums[r]);
             res+=maxRight-nums[r];
         }
     }
        System.out.println(res);
    }
}
