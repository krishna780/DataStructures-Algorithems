package com.dataStructures.Algorithems.programs;

import java.util.HashSet;

public class CommonElements {
    public static void main(String[] args) {
        String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
        HashSet<String> set=new HashSet<>();
        for(String str:s1){
            for(String str1:s2){
                if(str.equals(str1)){
                    set.add(str);
                }
            }
        }
    }
}
