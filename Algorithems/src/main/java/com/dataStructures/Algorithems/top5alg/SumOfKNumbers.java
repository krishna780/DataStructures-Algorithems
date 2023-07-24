package com.dataStructures.Algorithems.top5alg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SumOfKNumbers {
    public static void main(String[] args) {
        int[] ints={1,5,4,2,9,9,9};
        int k=3, target=15;
        List<Integer> list=new ArrayList<>();
        sumOfNumbers(ints,k,target);

    }

    private static void sumOfNumbers(int[] ints, int k, int target) {
        Set<Integer> list=new HashSet<>();
        List<Integer> set=new ArrayList<>();
        for(int i=0;i<ints.length-2;i++){
           int  currentTarget=target-ints[i];
            for (int j=i+1;j< ints.length;j++){
                int  con=currentTarget-ints[j];
                if(list.contains(con)){
                    System.out.println(List.of(con,ints[i],ints[j]));
                }
                list.add(ints[i]);
            }
        }

        System.out.println(set);
    }


}
