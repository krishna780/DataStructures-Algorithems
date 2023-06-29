package com.dataStructures.Algorithems.ArraysHashing;

import java.util.LinkedList;
import java.util.Queue;

public class MaxSumEx {
    static int maxSum(int arr[], int n, int k)
    {
        // k must be smaller than n
        if (n < k) {
            System.out.println("Invalid");
            return -1;
        }

        Queue<Integer> q = new LinkedList<Integer>();

        int m = Integer.MIN_VALUE;
        int su = 0;

        for (int i = 0; i < k; i++) {
            q.add(arr[i]);
            su += arr[i];
        }

        for (int i = k; i < n; i++) {
            su -= q.peek();
            q.remove();
            q.add(arr[i]);
            su += arr[i];
            m = Math.max(m, su);
        }
        return m;
    }

    public static void main(String[] args)
    {
        int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k = 4;
        int n = arr.length;
        System.out.println(maxSum(arr, n, k));
    }
}
