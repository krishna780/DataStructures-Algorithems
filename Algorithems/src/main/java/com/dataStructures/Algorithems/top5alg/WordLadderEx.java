package com.dataStructures.Algorithems.top5alg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordLadderEx {
    public static void main(String[] args) {
        Set<String> hot = Set.of("hot", "dot", "dog" ,"lot", "log","cog");
        Set<String>  set=new HashSet<>(hot);
        int i=ladderLength("hit", "cog",set);
        System.out.println(i);
    }

    private static int ladderLength(String begin, String end, Set<String> set) {
        Set<String> reached=new HashSet<>();
        reached.add(begin);
        set.add(end);
        int distance=1;
    List<String> list=new ArrayList<>();
    list.add(begin);
        while (!reached.contains(end)){
            Set<String> strings=new HashSet<>();
            for(String s:reached){
                for(int i=0;i<s.length();i++) {
                    char[] charArray = s.toCharArray();
                    for (char ch = 'a'; ch < 'z'; ch++) {
                        charArray[i] = ch;
                        String s1=new String(charArray);
                        if(set.contains(s1) && !list.contains(s1)){
                            list.add(s1);
                            strings.add(s1);
                            set.remove(s1);
                        }
                    }
                }
            }
            distance++;
            reached=strings;
        }
        System.out.println(list);
        return distance;
    }
}
