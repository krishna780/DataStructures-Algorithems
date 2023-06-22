package com.dataStructures.Algorithems.ArraysHashing;

public class FindLongestSubString {
    public static void main(String[] args) {
        String str="ababcda";
        int maxLength=0;
        for(int right=0, left=0; right<str.length();right++){
            int indexOf= str.indexOf(str.charAt(right), left);
            if(indexOf!=right){
                left= indexOf+1;
            }
            maxLength=Math.max(maxLength,right-left+1);
        }
        System.out.println(maxLength);
    }
}
