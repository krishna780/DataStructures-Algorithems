package com.dataStructures.Algorithems.ArraysHashing;

public class StringCombinations {
    public static void generateCombinations(String input) {
        generateCombinations("", input);
    }

    private static void generateCombinations(String prefix, String remaining) {
        int length = remaining.length();
        if (length == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < length; i++) {
                String substring = remaining.substring(0, i);
                String substring1 = remaining.substring(i + 1);
                generateCombinations(prefix + remaining.charAt(i),
                        substring + substring1);
            }
        }
    }

    public static void main(String[] args) {
        String input = "abc";
        generateCombinations(input);
    }
}
