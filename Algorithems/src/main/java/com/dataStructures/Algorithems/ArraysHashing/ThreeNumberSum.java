package com.dataStructures.Algorithems.ArraysHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {
    public static List<List<Integer>> findThreeNumberSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();

        // Sort the array in ascending order
        Arrays.sort(nums);

        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            // Avoid duplicate triplets by skipping identical elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Move the pointers to avoid duplicate triplets
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    // Move the pointers to the next unique elements
                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 9,-3, 9};
        int target = 15;

        List<List<Integer>> triplets = findThreeNumberSum(nums, target);

        // Print the triplets
        for (List<Integer> triplet : triplets) {
            System.out.println(triplet);
        }
    }
}
