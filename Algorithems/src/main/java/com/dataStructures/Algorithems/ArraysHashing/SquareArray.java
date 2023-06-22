package com.dataStructures.Algorithems.ArraysHashing;

import java.util.Arrays;

public class SquareArray {
    public static void main(String[] args) {
         int[] ints={1,2,3,4};
         int k=1,k1=1;
         int[] ints1=new int[ints.length];
         for(int i=0;i< ints.length;i++){
             ints1[i]=k;
             k*=ints[i];
         }
        for(int i= ints.length-1;i>=0;i--){
            ints1[i] *=k1;
            k1*=ints[i];
        }
        System.out.println(Arrays.toString(ints1));

    }
}
