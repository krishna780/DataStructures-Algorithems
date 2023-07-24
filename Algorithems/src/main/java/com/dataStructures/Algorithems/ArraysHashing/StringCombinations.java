package com.dataStructures.Algorithems.ArraysHashing;

public class StringCombinations {
    public static void generateCombinations(String input) {
        generateCombinations("", input);
    }

    private static void generateCombinations(String prefix, String remaining) {
        int length = remaining.length();
        if (remaining.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < length; i++) {
                char charAt = remaining.charAt(i);
                String substring = remaining.substring(0, i) + remaining.substring(i + 1);
                generateCombinations(prefix + charAt,
                        substring );
            }
        }
    }

    public static void main(String[]  args) {
        String input = "abc";
        generateCombinations(input);
    }
}
