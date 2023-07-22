package com.dataStructures.Algorithems.ArraysHashing;

import java.util.*;

public class TripletFinder {
    public static Set<List<Integer>> findTriplets(int[] nums, int targetSum) {
        Set<List<Integer>> triplets = new HashSet<>();

        // Sort the array to handle duplicates efficiently
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate values for the first element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                List<Integer> list=new ArrayList<>();
                if (currentSum == targetSum) {
                    List<Integer> num = List.of(nums[i], nums[left], nums[right]);
                    triplets.add(num);

                    // Skip duplicate values for the second element
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    // Skip duplicate values for the third element
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                } else if (currentSum < targetSum) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return triplets;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3,5, 4,5,5, 5, 6, 7, 8, 9};
        int targetSum = 15;

       Set<List<Integer>> triplets = findTriplets(nums, targetSum);

        System.out.println("Triplets with sum " + targetSum + ":");
        for (List<Integer> triplet : triplets) {
            Set<Integer> set=new HashSet<>(triplet);
            Set<Integer> integers = set.size() == 3 ? set : Set.of(1);
            if(integers.size()!=1){
                System.out.println(integers);
            }

        }
    }
}
