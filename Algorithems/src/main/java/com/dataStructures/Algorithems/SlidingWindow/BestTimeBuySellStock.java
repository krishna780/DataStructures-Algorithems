package com.dataStructures.Algorithems.SlidingWindow;

public class BestTimeBuySellStock {
    public static void main(String[] args) {
        int[] ints ={7,1,5,3,6,4};
        int max=0;
        int i = stockFind(ints, max);
        System.out.println(i);
    }

    private static int stockFind(int[] ints, int max) {
        int left=0,right=1;

        while (right<ints.length){
            if(ints[left]>ints[right]){
                left=right;
                right++;
            }else {
                max=Math.max(max,ints[right]-ints[left]);
                right++;
            }
        }

        return max;
    }
}
