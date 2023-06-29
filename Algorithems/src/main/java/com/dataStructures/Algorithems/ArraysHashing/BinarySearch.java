package com.dataStructures.Algorithems.ArraysHashing;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BinarySearch {
    public static void main(String[] args) {
        int[] ints = {18, 17, 7, 8, 5, 4, 3};
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));
        int left = 0, right = ints.length-1;
        binarySearchEx(ints, left, right);
    }

    private static void binarySearchEx(int[] ints, int left, int right) {
        int target = 8;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (ints[mid] == target) {
                System.out.println("targer value" + target);
            }
            if (target > ints[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;

            }
        }
    }
}
