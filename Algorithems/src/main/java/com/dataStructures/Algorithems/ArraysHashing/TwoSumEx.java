package com.dataStructures.Algorithems.ArraysHashing;

import java.util.*;
import java.util.stream.Collectors;


public class TwoSumEx {
    public static Map twoSum(int[] numbers, int target) {
        Map<Integer, Integer> hashMap=new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int number : numbers) {
            int newNum = target - number;
            if (list.contains(newNum)) {
                hashMap.put(number, newNum);
            }else {
                list.add(number);
            }
        }

        return hashMap;
    }
    public static void main(String[] args) {
       int[] ints={6,2,7,11,15};
        Map<Integer, Integer> map = twoSum(ints, 13);
        System.out.println(map);

    }
}
