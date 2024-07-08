package com.dataStructures.Algorithems.hashing;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopKElements {
    public static void main(String[] args) {
        List<Integer> integers=List.of(1,1,1,2,2);
        getTopKElements(integers);
    }

    private static void getTopKElements(List<Integer> integers) {
        Map<Integer, Long> collect = integers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List<Map.Entry<Integer, Long>> collect1 = collect.entrySet().stream()
                                                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                                                .collect(Collectors.toList());
        System.out.println(collect1);
    }
}
