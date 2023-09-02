package com.dataStructures.Algorithems.stream;

import java.util.StringTokenizer;

public class StringTokenize {
    public static void main(String[] args) {
        String str="welcome to java";
        StringTokenizer stringTokenizer=new StringTokenizer(str);
          while (stringTokenizer.hasMoreTokens()){
              System.out.println(stringTokenizer.nextToken());

          }
    }
}
