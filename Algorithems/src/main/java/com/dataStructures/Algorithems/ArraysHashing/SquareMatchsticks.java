package com.dataStructures.Algorithems.ArraysHashing;

import java.util.Arrays;

public class SquareMatchsticks {
    public static boolean makesquare(int[] matchsticks) {
        if (matchsticks == null || matchsticks.length < 4) {
            return false; // Not enough matchsticks to form a square
        }

        int totalLength = 0;
        for (int matchstick : matchsticks) {
            totalLength += matchstick; // Calculate the total length of all matchsticks
        }

        if (totalLength % 4 != 0) {
            return false; // The total length is not divisible by 4, so a square cannot be formed
        }

        int targetSideLength = totalLength / 4; // Calculate the desired side length of the square
        int[] sideLengths = new int[4]; // Array to store the lengths of each side of the square

        // Sort the matchsticks array in descending order to explore longer matchsticks first
        Arrays.sort(matchsticks);

        return backtrack(matchsticks, matchsticks.length - 1, sideLengths, targetSideLength);
    }

    private static boolean backtrack(int[] matchsticks, int index, int[] sideLengths, int target) {
        if (index < 0) {
            // All matchsticks have been used, check if all sides are of equal length
            return sideLengths[0] == target && sideLengths[1] == target && sideLengths[2] == target;
        }

        // Try placing the current matchstick into each side of the square
        for (int i = 0; i < 4; i++) {
            if (sideLengths[i] + matchsticks[index] <= target) {
                sideLengths[i] += matchsticks[index];

                // Recurse to the next matchstick
                if (backtrack(matchsticks, index - 1, sideLengths, target)) {
                    return true; // Found a valid configuration
                }

                // Undo the placement
                sideLengths[i] -= matchsticks[index];
            }
        }

        return false; // No valid configuration found
    }

    public static void main(String[] args) {
        int[] matchsticks = {3,3,3,3,4};
        boolean result = makesquare(matchsticks);
        System.out.println("Output: " + result);
    }
}

