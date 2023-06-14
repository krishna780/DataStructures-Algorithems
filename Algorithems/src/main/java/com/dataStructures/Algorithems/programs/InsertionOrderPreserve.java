package com.dataStructures.Algorithems.programs;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class InsertionOrderPreserve {
    public static void main(String[] args) {
        reverseString("I Am Not String");

    }

    private static void reverseString(String str) {
        String[] strings = str.split("");
        int i1 = strings.length;
        String[] st=new String[strings.length];
        for (int i = 0; i<= strings.length-1; i++){
            i1--;
            if(StringUtils.isBlank(strings[i])){
                st[i1]=" ";
            }else {
                st[i1] = strings[i];
            }
        }
        String string = Arrays.toString(st);
        System.out.println(string.replaceAll(",",""));
    }
}
