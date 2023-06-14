package com.dataStructures.Algorithems.programs;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckArrayEqual {
    public static void main(String[] args) {
        int[] arrayOne = {2, 5, 1, 7, 4};

        int[] arrayTwo = {2,7, 5, 1, 4};
        String[] s1 = {"java", "swings", "j2ee", "struts", "jsp", "hibernate"};

        String[] s2 = {"java", "struts", "j2ee", "hibernate", "swings", "jsp"};

        boolean b = Arrays.deepEquals(s1, s2);
        System.out.println(b);

        boolean  isEqual=true;
        Arrays.sort(arrayOne); Arrays.sort(arrayTwo);
        if(arrayOne.length==arrayTwo.length){
            for (int i=0;i< arrayOne.length;i++){
                if(arrayOne[i]!=arrayTwo[i]){
                    isEqual=false;
                }
            }
        }else {
            isEqual=false;
        }
      if(isEqual){
     //    System.out.println("equal");
      }

        String[] strings = {"java", "swings", "j2ee", "struts", "jsp", "hibernate","j2ee", "struts", "jsp"};

        Map<String, Long> collect = Arrays.stream(strings).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

    }
}
