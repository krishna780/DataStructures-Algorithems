package com.dataStructures.Algorithems.top5alg;

import java.util.*;

public class FindTopKElemets {
    public static void main(String[] args) {
        int k = 3;
        int[] ints = {18, 17, 7, 5, 8, 4, 3};
        Queue<Integer> list = new PriorityQueue<>();
        indTopKElemets(ints, k, list);
        System.out.println(list);
    }

    private static void indTopKElemets(int[] ints, int k, Queue<Integer> list) {
       for(int i:ints){
           list.offer(i);
           if(list.size()>k){
               list.poll();
           }
       }

    }
}
