package com.dataStructures.Algorithems.ArraysHashing;

import java.util.HashSet;
import java.util.List;

public class LongestConguence {
    public static int longestConsecutive(List<Integer> nums) {
        HashSet<Integer> numSet = new HashSet<>(nums);
        int longest = 0;
        for (int n : nums) {
            if (!numSet.contains(n - 1)) {
                int length = 1;
                while (numSet.contains(n + length)) {
                    length++;
                }
                longest = Math.max(length, longest);
            }
        }

        return longest;
    }
    public static void main(String[] args) {
        List<Integer> integers=List.of(100,4,200, 99,98,97,96, 3,1,2);
        System.out.println(longestConsecutive(integers));
    }
}
