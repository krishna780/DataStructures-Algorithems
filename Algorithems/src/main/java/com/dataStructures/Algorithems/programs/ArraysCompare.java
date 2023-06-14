package com.dataStructures.Algorithems.programs;

import java.util.*;

public class ArraysCompare {
    public static <R> void main(String[] args) {
        Integer[] arrayOne = {2, 5, 1, 7, 4};
        Integer[] arrayTwo = {2, 5, 1, 7, 4};
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        boolean equals = Arrays.deepEquals(arrayOne, arrayTwo);
        System.out.println(equals);

    }
}
