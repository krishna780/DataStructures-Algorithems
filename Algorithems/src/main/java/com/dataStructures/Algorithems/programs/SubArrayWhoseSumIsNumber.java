package com.dataStructures.Algorithems.programs;

import java.util.Arrays;

public class SubArrayWhoseSumIsNumber
{
    static void findSubArray(int[] inputArray, int inputNumber) {
        int length = inputArray.length;
        for (int i = 0; i< length; i++){
            for (int j = i; j< length; j++){
                int i2 = inputArray[i];
                int i1 = inputArray[j];
                int sum = i1 +i2 ;
                if(sum==inputNumber){
                        System.out.print(i2+" "+i1 +" ");
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        findSubArray(new int[]{42, 15, 12, 8, 6, 32, -14}, 18);

        findSubArray(new int[]{12, 5, 31, 13, 21, 8}, 13);

        findSubArray(new int[]{15, 51, 7, 81, 5, 11, 25}, 12);
    }
}

