package com.dataStructures.Algorithems.ArraysHashing;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class ConccatArray {
    public static void main(String[] args) {
        int[] array1 = {1,2,1};
        int[] combinedArray=new int[array1.length+array1.length];
         int index=0;
        for (int i = 0; i < array1.length; i++) {
            combinedArray[index] = array1[i];
            index++;
        }

        for (int i = 0; i < array1.length; i++) {
            combinedArray[index] = array1[i];
            index++;
        }
        System.out.println(Arrays.toString(combinedArray));
    }
}
