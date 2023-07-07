package com.dataStructures.Algorithems.ArraysHashing;


import java.util.*;

public class FindTheLongestSubstring {
    public static void main(String[] args) {
        String str="abcabcd";
        char[] charArray = str.toCharArray();
        findLongeststring(charArray);
    }

    private static void findLongeststring(char[] charArray) {
        Map<Character, Integer> map =new HashMap<>();
        String str = "";
        String st="";
        List<Character> characters=new ArrayList<>();
        int k=2,longestString=0;
        for(int i=0;i< charArray.length;i++){
            char c = charArray[i];
            if(!map.containsKey(c)){
                extracted(map, characters, c);
            }
            else {
                if(map.containsKey(c) && k!=0 && map.get(c)!=2 ){
                    extracted(map, characters, c);
                    k--;
                }else {
                    i  = map.get(c);
                    map.clear();
                    k=2;
                    str=characters.toString();
                    characters.clear();
                }
            }
            if(characters.size()> longestString  ){
                 longestString=characters.size();
            }if(str.length()> st.length()){
                st=str;
            }
        }

        System.out.println(st +" "+longestString);
    }

    private static void extracted(Map<Character, Integer> map, List<Character> characters, char c) {
        map.put(c, map.getOrDefault(c,0)+1);
        characters.add(c);
    }
}
