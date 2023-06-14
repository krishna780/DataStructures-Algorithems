package com.dataStructures.Algorithems.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AnagramEx {
    public static void main(String[] args) {
        String str1 = "geeksforgeeks";
        String str2 = "forgeeksgeeks";

        test(str1,str2);
    }

    private static void test(String str1, String str2) {

        String[] charArray1 = str1.split("");
        String[] charArray2 = str2.split("");
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        boolean equals = Arrays.equals(charArray2, charArray1);
        System.out.println(equals);
    }
}
