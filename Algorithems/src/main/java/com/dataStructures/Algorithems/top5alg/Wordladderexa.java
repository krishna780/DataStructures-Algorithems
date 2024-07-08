package com.dataStructures.Algorithems.top5alg;

import java.util.*;

public class Wordladderexa {
    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");

        int result = ladderLength(beginWord, endWord, wordList);
        System.out.println(result);
    }

    private static int ladderLength(String beginWord, String endWord, List<String> lit) {
        Set<String> wordList= new HashSet<>(lit);
        int ladder=0;
        Queue<String> list=new ArrayDeque<>();
        list.offer(beginWord);
        if(!wordList.contains(endWord)){
          return ladder;
        }
      int transaction=1;
        while (!list.isEmpty()){
            for(int i=0; i<wordList.size();i++) {
                String string = list.poll();
                for (int j = 0; j < string.length(); j++) {
                    char[] charArray = string.toCharArray();
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (charArray[j] == c) continue;
                        charArray[j] = c;
                        String newWord = new String(charArray);
                        if (newWord.equals(endWord)) {
                            return transaction + 1;
                        }
                        if (wordList.contains(newWord)) {
                            list.add(newWord);
                            wordList.remove(newWord);
                        }
                    }
                }
            }
                transaction++;

        }
        return 0;
    }
}
