package com.dataStructures.Algorithems.ArraysHashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubString {
    public static void main(String[] args) {
        String str="aabcabcd";
        Map<String,Integer> hashMap=new LinkedHashMap<>();
        String st = "";
        int size=0, newSize=0;
        for(int i=0;i<str.length();i++){
            String charAt = String.valueOf(str.charAt(i));
            if(hashMap.containsKey(charAt)){
               i= hashMap.get(charAt);
               hashMap.clear();
            }else {
                hashMap.put(charAt,i);
                size= hashMap.size();
            }
            if(size>newSize){
                newSize=size;
                st=hashMap.keySet().toString();
            }
        }
        System.out.println(st);
    }
}
