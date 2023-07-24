package com.dataStructures.Algorithems.top5alg;

import java.util.Arrays;
import java.util.Random;

public class QuirkSortExam {
    public static void main(String[] args) {
        int[] intArray={20,35,-15,7,55,1,-22, 25,30};

        quirkSort(intArray, 0,intArray.length);
        Arrays.stream(intArray).forEach(System.out::println);

    }

    public static void quirkSort(int[] a,int start, int end){
        if(end-start<2){
            return;
        }
        int pivotIndex=partion(a,start,end);
        quirkSort(a, start, pivotIndex);
        quirkSort(a, pivotIndex+1, end);
    }

    private static int partion(int[] a, int start, int end) {

              swap(a,start,getPivot(start,end));
              int border =start+1;
              for(int i=border;i< end;i++){
                  if(a[i]<a[start]){
                      swap(a,i,border++);
                  }
              }
        swap(a,start,border-1);

        return border-1;
        }

        private static int getPivot(int low, int height){
            Random random=new Random();
            return random.nextInt(height-low)+low;
        }

        private static void swap(int[] a, int index1, int index2){
        int temp=a[index1];
        a[index1]=a[index2];
        a[index2]=temp;
        }
}
