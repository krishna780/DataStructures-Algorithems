package com.dataStructures.Algorithems.ArraysHashing;

import java.util.List;

public class TopThreeElements {
    public static void main(String[] args) {
        int[] array = {4, 10, 8, 2, 7, 5, 9};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        topTwo(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > first) {
                third = second;
                second = first;
                first = array[i];
            } else if (array[i] > second) {
                third = second;
                second = array[i];
            } else if (array[i] > third) {
                third = array[i];
            }
        }
        System.out.println(List.of(first, second, third));
    }

    private static void topTwo(int[] array) {
        int firstElement = 0, secondElement = 0;
        for (int i = 0; i < array.length; i++) {
          if(array[i]>firstElement){
              secondElement=firstElement;
              firstElement=array[i];
          } else if (array[i]>secondElement) {
              secondElement=array[i];

          }
        }
        System.out.println(firstElement+ "   "+secondElement);
    }
}