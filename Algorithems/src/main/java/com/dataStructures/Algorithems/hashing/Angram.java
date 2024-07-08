package com.dataStructures.Algorithems.hashing;

import java.util.*;

public class Angram {
    public static void main(String[] args) {
        String[] strings={"eat","tea","tan","ate","nat","bat"};
        Map<String,List<String>> list= new HashMap<>();
        findAngram(strings,list);
        System.out.println(list);

    }

    private static  void findAngram(String[] strings, Map<String, List<String>> list) {


        for(int i=0;i<strings.length;i++){
            String string = strings[i];
            char[] charArray = string.toCharArray();
            String string1 = Arrays.toString(charArray);
            Arrays.sort(charArray);
            if(list.containsKey(string1)){
                list.get(string1).add(string);
            }else {
                List<String> ls=new ArrayList<>();
                ls.add(string);
                list.put(string1, ls);
            }

        }
    }
}
