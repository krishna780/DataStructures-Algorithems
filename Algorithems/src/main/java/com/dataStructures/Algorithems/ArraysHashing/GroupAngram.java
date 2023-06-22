package com.dataStructures.Algorithems.ArraysHashing;

import java.util.*;

public class GroupAngram {
    public static void main(String[] args) {
        String[] strings={"eat","tea","tan","ate","nat","bat"};
        Map<String, List<String>> listMap=new HashMap<>();
        for (String str:strings){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String st=new String(charArray);
            if(listMap.containsKey(st)){
                listMap.get(st).add(str);
            }else {
                List<String> words = new ArrayList<>();
                words.add(str);
                listMap.put(st,words);
            }
        }
        System.out.println(Arrays.toString(listMap.entrySet().toArray()));
    }
}
