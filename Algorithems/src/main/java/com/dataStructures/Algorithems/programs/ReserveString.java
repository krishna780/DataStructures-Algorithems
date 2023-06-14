package com.dataStructures.Algorithems.programs;

import java.util.Arrays;

public class ReserveString {
    public static void main(String[] args) {
        reverseString("I Am Not String");

        reverseString("JAVA JSP ANDROID");

        reverseString("1 22 333 4444 55555");
    }

    private static void reverseString(String str) {
        char[] charArray = str.toCharArray();
        char[] chars=new char[charArray.length];
        for (int i=0;i< charArray.length;i++){
            if(charArray[i]==' '){
                chars[i]=' ';
            }
        }
        int i1 = charArray.length - 1;
        for (int i= 0;i<=charArray.length-1;i++){
            if(charArray[i]!=' '){
                if(chars[i1]==' '){
                    i1--;
                }
                chars[i1]=charArray[i];
                i1--;
            }
        }
        System.out.println(Arrays.toString(chars));
    }
}
