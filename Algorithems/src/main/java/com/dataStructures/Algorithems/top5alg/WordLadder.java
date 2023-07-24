package com.dataStructures.Algorithems.top5alg;

import java.util.HashSet;
import java.util.Set;

public class WordLadder {
    public static void main(String[] args) {
        Set<String> hot = Set.of("hit", "dot", "dog" ,"lot",
                "log","cog");
        Set<String>  set=new HashSet<>(hot);
        int i=ladderLength("hot", "cog",set);
        System.out.println(i);

    }

    public static int ladderLength(String beginWord, String endWord, Set<String> wordDict) {
        Set<String> reached = new HashSet<String>();
        reached.add(beginWord);
        wordDict.add(endWord);
        int distance = 1;
        while (!reached.contains(endWord)) {
            Set<String> toAdd = new HashSet<String>();
            for (String each : reached) {
                for (int i = 0; i < each.length(); i++) {
                    char[] chars = each.toCharArray();
                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        chars[i] = ch;
                        String word = new String(chars);
                        if (wordDict.contains(word)) {
                            toAdd.add(word);
                            wordDict.remove(word);
                        }
                    }
                }
            }
            distance++;
            if (toAdd.size() == 0) return 0;
            reached = toAdd;
        }
        return distance;
    }
}
