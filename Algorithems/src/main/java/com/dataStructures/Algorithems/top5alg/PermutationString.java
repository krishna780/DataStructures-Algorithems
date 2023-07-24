package com.dataStructures.Algorithems.top5alg;

public class PermutationString {
    public static void main(String[] args) {
        String str="abc";
        permutationString("", str);
    }

    private static void permutationString(String s, String str) {

        if(str.isEmpty()){
            System.out.println(s);
        }
        for(int i=0;i<str.length();i++){
            char charAt = str.charAt(i);
            String st=str.substring(0,i)+str.substring(i+1);
            permutationString(s+charAt,st);
        }
    }
}
