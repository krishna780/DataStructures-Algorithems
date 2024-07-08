package com.dataStructures.Algorithems.top5alg;

import java.util.HashMap;

public class FindLongestSubString {
    public static void main(String[] args) {
        String str="abcacbdab";
        int sum=0, newsum=0;
        HashMap<Character, Integer> set=new HashMap<>();
       for(int i=0; i<str.length();i++){
           char charAt = str.charAt(i);
           if(!set.containsKey(charAt)){
               set.put(charAt,i);
           }else{
               newsum=set.size();
               i = set.get(charAt);
               set.clear();
           }
           sum = Math.max(sum, newsum);
       }
        System.out.println(sum);
    }
}
