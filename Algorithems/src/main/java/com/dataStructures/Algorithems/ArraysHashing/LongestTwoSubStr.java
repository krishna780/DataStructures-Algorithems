package com.dataStructures.Algorithems.ArraysHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.HashMap;

import java.util.HashMap;

 class LongestTwoSubStr {



    public static void main(String[] args) {
        String str = "aabbcc";
        String result = longestTwoSubStr(str);
        System.out.println("The longest substring with exactly two unique characters: " + result);
        System.out.println("Length of the longest substring: " + result.length());
    }

     private static String longestTwoSubStr(String str) {
         if (str == null || str.length() == 0) {
             return "";
         }

         int maxLength = 0;
         int windowStart = 0;
         int maxStart = 0;
         HashMap<Character, Integer> charFrequency = new HashMap<>();

         for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
             char rightChar = str.charAt(windowEnd);
             charFrequency.put(rightChar, charFrequency.getOrDefault(rightChar, 0) + 1);

             // Shrink the sliding window, until we are left with '2' unique characters in the charFrequency
             while (charFrequency.size() > 2) {
                 char leftChar = str.charAt(windowStart);
                 charFrequency.put(leftChar, charFrequency.get(leftChar) - 1);
                 if (charFrequency.get(leftChar) == 0) {
                     charFrequency.remove(leftChar);
                 }
                 windowStart++; // shrink the window
             }

             // Check if this window is the longest one so far
             if (windowEnd - windowStart + 1 > maxLength) {
                 maxLength = windowEnd - windowStart + 1;
                 maxStart = windowStart;
             }
         }

         // Return the longest substring with exactly two unique characters
         return str.substring(maxStart, maxStart + maxLength);
     }
     }


