package com.dataStructures.Algorithems.ArraysHashing;

import java.util.Arrays;

public class GreatestElemetEx {
    public static void main(String[] args) {
        int[] arr = {18,17,5,4,6,1};
        for (int i=0; i< arr.length;i++){
            int max=-1;
            for (int j=i+1; j< arr.length;j++){
                max=Math.max(max,arr[j]);
            }
            arr[i]=max;
        }
        System.out.println(Arrays.toString(arr));
    }
}
