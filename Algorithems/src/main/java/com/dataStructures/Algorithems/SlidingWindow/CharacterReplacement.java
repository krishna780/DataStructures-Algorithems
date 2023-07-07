package com.dataStructures.Algorithems.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class CharacterReplacement {
    public static void main(String[] args) {
        String s="AABABBA";
        characterReplacementEx(s, 2);
    }

    private static void characterReplacementEx(String s, int k) {
        int maxcount = 0;
        int maxrepeat = 0;
        int i = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int j = 0; j < s.length(); j++) {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            maxrepeat = Math.max(maxrepeat, map.get(s.charAt(j)));
            if (j - i + 1 - maxrepeat > k) {
                map.put(s.charAt(i),
                        map.getOrDefault(s.charAt(i), 0)-1);
                i++;
            }
            maxcount = Math.max(maxcount, j - i + 1);
        }
        System.out.println(maxcount);
    }
}
