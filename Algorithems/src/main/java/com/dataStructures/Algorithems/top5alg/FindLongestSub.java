package com.dataStructures.Algorithems.top5alg;

public class FindLongestSub {
    public static void main(String[] args) {
        String str="abcacbd";
       int s= string(str);
        System.out.println(s);
    }

    private static int string(String str) {
          int maxLength = 0;
          for(int right=0,left=0;right<str.length();right++){
              int indexOf = str.indexOf(str.charAt(right), left);
              if (indexOf!=right){
                  left=indexOf+1;
              }
              maxLength=Math.max(maxLength, right-left+1);
          }
        return maxLength;
    }
}
