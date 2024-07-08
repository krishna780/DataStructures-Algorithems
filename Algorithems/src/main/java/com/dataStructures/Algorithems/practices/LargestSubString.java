package com.dataStructures.Algorithems.practices;

import java.util.HashMap;
import java.util.Map;
public class LargestSubString {
    public static void main(String[] args) {
        String str="abcacbdab"; int size=0;
        Map<Character,Integer> hashMap=new HashMap<>();
        for (int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(!hashMap.containsKey(c)){
                hashMap.put(c,i);
            }else {
                i=hashMap.get(c);
                int newSize= hashMap.size();
                hashMap.clear();
                if(size<newSize){
                    size=newSize;
                }
            }
        }
        System.out.println(size);
    }
}
