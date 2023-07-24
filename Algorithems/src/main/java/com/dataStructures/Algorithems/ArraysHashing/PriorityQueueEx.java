package com.dataStructures.Algorithems.ArraysHashing;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        Queue<Integer> queue=new PriorityQueue<>(4);
        int[] nums={8,12,31,83,90,75};
        for(int n:nums) {
            queue.add(n);
            if (queue.size() == 4) {
                queue.poll();
            }
        }
        System.out.println(queue);
    }
}
