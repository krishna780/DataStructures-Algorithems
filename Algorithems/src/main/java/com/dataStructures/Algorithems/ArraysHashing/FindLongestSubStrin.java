package com.dataStructures.Algorithems.ArraysHashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindLongestSubStrin {
    public static void main(String[] args) {
        String str="acbcakcfs";
        String longestSubstr=null;
        int longestSubstringlength=0;
        Map<Character,Integer> hashMap=new HashMap<>();
             for (int i=0;i<str.length();i++){
                 char c = str.charAt(i);
            if(!hashMap.containsKey(c)){
                hashMap.put(c,i);
            }else {
                 i = hashMap.get(c);
                 hashMap.clear();
            }
            if (hashMap.size()>longestSubstringlength){
                longestSubstringlength=hashMap.size();
                Set<Character> set = hashMap.keySet();
                longestSubstr =set.toString()
                        .replaceAll("[\\-\\+\\.\\^:,] ", "");;
            }
             }
        System.out.println(longestSubstringlength+ "   "+longestSubstr);
    }
}
