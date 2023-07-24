package com.dataStructures.Algorithems.top5alg;

import java.util.*;

public class WordLadderJava {
    public static void main(String[] args) {
        List<String> hot = List.of("hot", "dot", "dog" ,"lot", "log","cog");
       List<String>  set=new LinkedList<>(hot);
        int i=ladderLength("log", "hot",set);
        System.out.println(i);
    }

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> dictionary = new HashSet<>(wordList);
        if (!dictionary.contains(endWord)) {
            return 0;
        }

        int minLength = 0;
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.offer(beginWord);
        visited.add(beginWord);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            minLength += levelSize != 0 ? 1 : 0;

            for (int i = 0; i < levelSize; i++) {
                String current = queue.poll();
                if (current.equals(endWord)) {
                    return minLength;
                } else {
                    char[] currentChars = current.toCharArray();
                    for (int j=0; j < currentChars.length; j++) {
                        char prevChar = currentChars[j];
                        for (char nextChar = 'a'; nextChar <= 'z'; nextChar++) {
                            currentChars[j] = nextChar;
                            String nextWord = new String(currentChars);
                            if (dictionary.contains(nextWord) && !visited.contains(nextWord)) {
                                queue.offer(nextWord);
                                visited.add(nextWord);
                            }
                        }
                        currentChars[j] = prevChar;
                    }
                }
            }
        }
        System.out.println(visited);
        return 0;
    }
}
