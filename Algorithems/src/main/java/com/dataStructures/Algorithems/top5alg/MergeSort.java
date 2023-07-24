package com.dataStructures.Algorithems.top5alg;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        Random random=new Random();
        int[] num=new int[10];
        for(int i=0;i< num.length;i++){
            num[i]= random.nextInt(100);
        }
        System.out.println(Arrays.toString(num));
        mergesort(num);
        System.out.println(Arrays.toString(num));

    }

    private static void mergesort(int[] num) {
        int length= num.length;
        if(length<2){
           return;
       }
       int mid=length/2;
        int[] leftHalf=new int[mid];
        int[] rightHalf=new int[length-mid];

        for(int i=0;i<mid;i++){
            leftHalf[i]=num[i];
        }
        for(int i=mid;i<length;i++){
            rightHalf[i-mid]=num[i];
        }
        mergesort(leftHalf);
        mergesort(rightHalf);
        merge(num,leftHalf,rightHalf);
    }

    private static void merge(int[] num, int[] leftHalf, int[] rightHalf) {
        int leftLength = leftHalf.length;
        int rightLength = rightHalf.length;
        int i=0,j=0,k=0;
        while (i<leftLength &&j<rightLength){
            if(leftHalf[i]<=rightHalf[j]){
                num[k]=leftHalf[i];
                i++;
            }else{
                num[k]=rightHalf[j];
                j++;
            }
            k++;
        }
       while (i<leftLength){
           num[k]=leftHalf[i];
           i++;k++;
       }
        while (j<rightLength){
            num[k]=rightHalf[j];
            j++;k++;
        }
    }
}
