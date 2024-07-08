package com.dataStructures.Algorithems.programs;

public class Angaram {
    public static void main(String[] args) {
        boolean anagram = isAnagram("raoecar", "carrace");
        System.out.println(anagram);

    }
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] store= new int[26];
        for(int i=0; i<s.length();i++){
            System.out.println(s.charAt(i)-'a');
            store[s.charAt(i)-'a']++;

            store[t.charAt(i)-'a']--;
        }
        for(int n:store) if(n!=0) return false;
        return true;
    }
}
