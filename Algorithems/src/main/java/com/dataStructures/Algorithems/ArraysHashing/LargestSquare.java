package com.dataStructures.Algorithems.ArraysHashing;

import java.util.Arrays;

public class LargestSquare {
    public static int largestSquareEx(int A, int B) {
        int totalSticks = A + B;
        int maxLenghthTogether = totalSticks / 4;
        while(maxLenghthTogether > 0) {
            int maxLenghthA = A / maxLenghthTogether;
            int maxLenghthB = B / maxLenghthTogether;
            if(maxLenghthA + maxLenghthB >= 4) {
                return maxLenghthTogether;
            }
            maxLenghthTogether--;
        }
        return 0;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int maxSide = largestSquareEx(a, b);
        largestSquareEx2(10, 7);
        System.out.println("The largest possible square side is " + maxSide);
    }

    private static void largestSquareEx2(int stick1, int stick2) {
        int[] sortedSticks = {stick1, stick2};
          Arrays.sort(sortedSticks);

        if (sortedSticks[0] == sortedSticks[1]) {
            // The two sticks are already equal in length, so a square can be formed
            int[] cutSticks = {sortedSticks[0], sortedSticks[0], sortedSticks[0], sortedSticks[0]};
            System.out.println("Cut sticks: " + Arrays.toString(cutSticks));
        } else {
            // Cut the longer stick to match the length of the shorter stick
            int[] cutSticks = {sortedSticks[0], sortedSticks[0], sortedSticks[1] - sortedSticks[0], sortedSticks[1] - sortedSticks[0]};
            System.out.println("Cut sticks: " + Arrays.toString(cutSticks));
        }
    }
}
