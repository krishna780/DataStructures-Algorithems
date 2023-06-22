package com.dataStructures.Algorithems.ArraysHashing;

import java.util.*;
import java.util.stream.Collectors;


public class TwoSumEx {
    public static Map twoSum(int[] numbers, int target) {
        Map<Integer, Integer> hashMap=new HashMap<>();
        List<Integer> list = Arrays.stream(numbers)
                .boxed().collect(Collectors.toList());
        for (int number : numbers) {
            int newNum = target - number;
            if (list.contains(newNum) && !hashMap.containsKey(number) && !hashMap.containsValue(number)) {
                hashMap.put(number, newNum);
            }
        }

        return hashMap;
    }
    public static void main(String[] args) {
       int[] ints={6,2,7,11,15};
        Map map = twoSum(ints, 13);
        System.out.println(map.toString());

    }
}
