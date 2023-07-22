package com.dataStructures.Algorithems.ArraysHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeaderOfString {
    public static void main(String[] args) {
      int[] ints ={18,17,7,8,5,4,3};
      List<Integer> list=new ArrayList<>();
      int max=0;
      for (int i= ints.length-1;i >=0;i--){
          if(max<ints[i]){
              max=ints[i];
              list.add(ints[i]);
          }
      }
        System.out.println(list);
    }
}
