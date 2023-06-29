package com.dataStructures.Algorithems.ArraysHashing;

import java.util.Arrays;

public class BinarySearchEx {
    public static void main(String[] args) {
        int[] ints = {18, 17, 7, 8, 5, 4, 3};
        Arrays.sort(ints);
        int left = 0;
        binarySearchExs(ints,  left, ints.length - 1);
    }

    private static void binarySearchExs(int[] ints, int left, int right) {
        int target = 17;
        if (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == ints[mid]) {
                System.out.println(target);
            }
            if (target < ints[mid]) {
                binarySearchExs(ints, left, mid - 1);
            } else {
                binarySearchExs(ints, mid + 1, right);
            }
        }
    }
}