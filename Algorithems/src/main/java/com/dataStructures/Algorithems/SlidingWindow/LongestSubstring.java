package com.dataStructures.Algorithems.SlidingWindow;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestSubstring {
    public static String findLongestSubstring(String input) {
        String longestSubstring = "";
        int maxLength = 0;
        Set<String> list=new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 2; j <= input.length(); j += 2) {
                String substring = input.substring(i, j);
                if (isRepeated(substring) && substring.length() >= maxLength) {
                    maxLength = substring.length();
                    longestSubstring = substring;
                    if(longestSubstring.length()!=2){
                        list.add(longestSubstring);
                    }
                }
            }
        }

        return list.stream().collect(Collectors.joining(" "));
    }

    private static boolean isRepeated(String substring) {
        for (int i = 0; i < substring.length(); i += 2) {
            char current = substring.charAt(i);
            char next = substring.charAt(i + 1);
            if (current != next) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "aabbcddcc";
        String longestSubstring = findLongestSubstring(input);
        System.out.println("Longest substring: " + longestSubstring);
    }
}
