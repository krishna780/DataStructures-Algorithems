package com.dataStructures.Algorithems.ArraysHashing;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopTwoElements {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap=new HashMap<>();
        int k=2;
        int[] ints={1,1,1,2,2,3};
        for (int i=0;i< ints.length;i++){
            int anInt = ints[i];
            if(hashMap.containsKey(anInt)){
                hashMap.put(anInt, hashMap.getOrDefault(anInt,0)+1);
            }else {
                hashMap.put(anInt,1);
            }
        }
        List<Integer> collect = hashMap.entrySet().stream()
                .filter(s -> s.getValue().intValue() >= k).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(collect);

    }
}
