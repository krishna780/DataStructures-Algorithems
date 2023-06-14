package com.dataStructures.Algorithems.programs;

public class StringReverse {
    public static void main(String[] args) {
        String str="My Java";
        char[] charArray = str.toCharArray();
        StringBuilder stringBuilder=new StringBuilder();
        for (int i=charArray.length-1;i>=0;i--){
            char c1 = charArray[i];
            stringBuilder.append(c1);
        }
        System.out.println(stringBuilder);
    }
}
