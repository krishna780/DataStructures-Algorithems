package com.dataStructures.Algorithems.SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String str="abcbcadbb";
        findLongestSubString(str);
    }

    private static void findLongestSubString(String s) {
        List<Character> substringL = new ArrayList<>();
        int largestlength = 0;
        for(int right = 0; right < s.length(); right++) {
            if(substringL.contains(s.charAt(right))) {
                // get the index of the char
                int index = substringL.indexOf(s.charAt(right));
                substringL.remove(index);
                if(index > 0)
                    substringL.subList(0, index).clear();
            }
            substringL.add(s.charAt(right));
            largestlength = Math.max(largestlength, substringL.size());
        }
        System.out.println(largestlength);
    }
}
