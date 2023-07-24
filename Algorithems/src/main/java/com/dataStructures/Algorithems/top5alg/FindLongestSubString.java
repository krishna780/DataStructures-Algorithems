package com.dataStructures.Algorithems.top5alg;

import java.util.HashMap;
import java.util.Map;

public class FindLongestSubString {
    public static void main(String[] args) {
        String str="abcabcbb";
        int sum=0, newsum=0;
        Map<Character, Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char charAt = str.charAt(i);
            if(!map.containsKey(charAt)){
                map.put(charAt,i);
            }else{
                newsum= map.size();
                i=map.get(charAt);
                map.clear();
            }
            sum=Math.max(sum,newsum);
        }
        System.out.println(sum);
    }
}
