package com.dataStructures.Algorithems.top5alg;

import java.util.*;

public class FindTopKElemets {
    public static void main(String[] args) {
        int k = 3;
        int[] ints = {18, 17, 7, 8, 5, 4, 3};
        Queue<Integer> list = new PriorityQueue<>();
        indTopKElemets(ints, k, list);
        System.out.println(list.size());
    }

    private static void indTopKElemets(int[] ints, int k, Queue<Integer> list) {
        for (int i = 0; i < k; i++) {
            list.offer(ints[i]);
        }
        for (int i = k; i < list.size(); i++) {
            if (list.size() == k) {
                   list.poll();
                   list.offer(ints[i]);
            }else {
                list.offer(ints[i]);
            }
        }

    }
}
