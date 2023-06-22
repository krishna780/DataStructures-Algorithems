package com.dataStructures.Algorithems.ArraysHashing;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> combinations = combinationSum(candidates, target);
        System.out.println(combinations);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> combinations = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), combinations);
        return combinations;
    }

    private static void backtrack(int[] candidates, int target, int start, List<Integer> currentCombination,
                                  List<List<Integer>> combinations) {
        if (target == 0) {
            combinations.add(new ArrayList<>(currentCombination));
            return;
        }

        if (target < 0) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            currentCombination.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i, currentCombination, combinations);
            currentCombination.remove(currentCombination.size() - 1);
        }
    }
}
