package com.dataStructures.Algorithems.recursion;

public class ArraySorted {
    public static void main(String[] args) {
        int[] n={1,2,4,3,5};
        System.out.println(isArraySorted(n, n.length));
    }
    private static int isArraySorted(int[] n, int length) {
    if(n.length==1){
        return 1;
    }
        return (n[length - 1] < n[length - 2]) ? 0 :
                isArraySorted(n, length - 1);
    }
}
