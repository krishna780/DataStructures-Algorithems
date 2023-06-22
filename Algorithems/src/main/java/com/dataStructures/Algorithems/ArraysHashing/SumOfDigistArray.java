package com.dataStructures.Algorithems.ArraysHashing;

public class SumOfDigistArray {
    public static void main(String[] args) {
        int[] ints = {1, 5, 4, 2, 9, 9, 9};
        int  right = ints.length - 1, target = 15;
        for (int i = 0; i < ints.length; i++) {
            int l = i + 1;
            while (l < right) {
                int i1 = ints[i] + ints[l] + ints[right];
                if (target == i1 ) {
                    System.out.println(ints[i] + " " + ints[l] + " " + ints[right]);
                    l++;
                    right--;
                } else if (target>i1) {
                    l++;
                }else {
                    right--;
                }
            }
        }
    }
}
