package com.dataStructures.Algorithems.top5alg;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringKUnique {

    public static String longestSubstringWithKUniqueCharacters(String s, int k) {
        if (s == null || s.length() == 0 || k <= 0) {
            return "";
        }

        Map<Character, Integer> charFrequency = new HashMap<>();
        int maxLength = 0;
        int windowStart = 0;
        int maxStart = 0;

        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            char rightChar = s.charAt(windowEnd);
            charFrequency.put(rightChar, charFrequency.getOrDefault(rightChar, 0) + 1);

            while (charFrequency.size() > k) {
                char leftChar = s.charAt(windowStart);
                charFrequency.put(leftChar, charFrequency.get(leftChar) - 1);
                if (charFrequency.get(leftChar) == 0) {
                    charFrequency.remove(leftChar);
                }
                windowStart++;
            }

            if (charFrequency.size() == k && (windowEnd - windowStart + 1) > maxLength) {
                maxLength = windowEnd - windowStart + 1;
                maxStart = windowStart;
            }
        }

        return s.substring(maxStart, maxStart + maxLength);
    }

    public static void main(String[] args) {
        String s = "aabbcc";
        int k = 2;
        String result = longestSubstringWithKUniqueCharacters(s, k);
        System.out.println("Longest substring with " + k + " unique characters: " + result);

        s = "abcba";
        k = 2;
        result = longestSubstringWithKUniqueCharacters(s, k);
        System.out.println("Longest substring with " + k + " unique characters: " + result);
    }
}
