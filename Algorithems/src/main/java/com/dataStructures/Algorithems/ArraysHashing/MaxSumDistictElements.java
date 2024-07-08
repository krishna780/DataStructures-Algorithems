package com.dataStructures.Algorithems.ArraysHashing;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class MaxSumDistictElements {
    public static int maxSumDistinct(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        int maxSum = 0;

        for (int i = n - 1; i >= n - k; i--) {
            maxSum += arr[i];
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums={1,5,4,2,9,8,7,9};
        int k = 3;
        int maxSum = maxSumDistinct(nums, k);
        System.out.println("Maximum sum of " + k + " distinct elements: " + maxSum);
    }}
