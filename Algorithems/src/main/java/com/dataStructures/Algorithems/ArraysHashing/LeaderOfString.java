package com.dataStructures.Algorithems.ArraysHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeaderOfString {
    public static void main(String[] args) {
      int[] ints ={18,17,7,8,5,4,3};
       List<List<Integer>> hashSet=new ArrayList<>();
       int length=ints.length;
       for(int i=0;i<length-1 ;i+=2){
          int newInt=i+1;
          if(ints[i]>ints[newInt]){
              hashSet.add(new ArrayList<>(Arrays.asList(ints[i],ints[newInt])));
          }else {
              hashSet.add(new ArrayList<>(List.of(ints[newInt])));
          }
       }
        System.out.println(hashSet.toString().replaceAll("[-+^]*, ",""));
    }
}
