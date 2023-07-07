package com.dataStructures.Algorithems.ArraysHashing;

import java.util.ArrayList;
import java.util.List;

public class FindLeaderOftheElement {
    public static void main(String[] args) {
        int[] arr = {18, 9, 7, 14, 8, 6};
        List<Integer> leaders = findLeaders(arr);
        System.out.println(leaders);
    }

    private static List<Integer> findLeaders(int[] arr) {
        int minValue=Integer.MIN_VALUE;
        List<Integer> list=new ArrayList<>();
       for(int i= arr.length-1;i>=0;i--){
            if(arr[i]>minValue){
                minValue=arr[i];
                list.add(minValue);
            }
        }

        return list;
    }
}
