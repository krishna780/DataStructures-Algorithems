package com.dataStructures.Algorithems.programs;


import java.util.*;

public class Anagram {
    public static void main(String[] args) {
    String[]  strs = {"act","pots","tops","cat","stop","hat"};

        Map<String, List<String>> map=new HashMap<>();

        for (String s:strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String string = Arrays.toString(charArray);
            if(map.containsKey(string)){
                map.get(string).add(s);
            }else {
                List<String> list=new ArrayList<>();
                list.add(s);
                map.put(string,list);
            }
        }
        List<List<String>> values = (List<List<String>>) map.values();
    }
}
