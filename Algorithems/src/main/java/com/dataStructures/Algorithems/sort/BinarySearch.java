package com.dataStructures.Algorithems.sort;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {16, 19, 20, 23, 45, 56, 78, 90, 96, 100};

        int s= 78,  start=0,  end=arr.length-1;

        System.out.println( binary(arr, start,end));

    }

    private static int binary(int[] arr,  int start, int end) {
        int search= 78, k=0;
        while (start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==search){
                System.out.println(search);
                return k=search;
            }
             if(arr[mid]<search){
                 start=mid+1;
             } else {
               end=mid-1;
             }
        }
        return k;
    }

}
