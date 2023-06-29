package com.dataStructures.Algorithems.ArraysHashing;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        Queue<Integer> queue=new PriorityQueue<>(3);
        int[] nums={8,12,31,83,90,75};
        for(int n:nums) {
            if (queue.size() == 3) {
                queue.poll();
                queue.add(n);
            }else{
                queue.add(n);
            }
        }
        System.out.println(queue);
    }
}
