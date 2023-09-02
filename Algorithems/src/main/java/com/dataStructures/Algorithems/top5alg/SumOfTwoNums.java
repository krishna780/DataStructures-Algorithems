package com.dataStructures.Algorithems.top5alg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SumOfTwoNums {
    public static void main(String[] args) {
        Random random=new Random();
        int[] ints=new int[10];
        for (int i=0;i<10;i++){
            ints[i]= random.nextInt(10);
        }
        findSorting(ints);
    }

    private static void findSorting(int[] ints) {
        int target=8;
        List<Integer> list=new ArrayList<>();
        System.out.println(Arrays.toString(ints));
        for(int i=0;i< ints.length;i++){
            int i1 = target - ints[i];
            if(list.contains(i1)){
                System.out.println(ints[i]+" "+i1);
            }else {
                list.add(ints[i]);
            }
        }
    }
}
