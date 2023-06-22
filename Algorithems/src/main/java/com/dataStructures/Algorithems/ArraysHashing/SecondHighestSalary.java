package com.dataStructures.Algorithems.ArraysHashing;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondHighestSalary {
    public static void main(String[] args) {
        Map<String, Integer> map=new HashMap<>();
        map.put("ravi", 1400);
        map.put("gopi", 1300);
        map.put("asha", 1200);
        map.put("hari", 1300);
        map.put("sai", 1300);
        map.put("sneha", 1400);
        map.put("jsj",123);

        Map.Entry<Integer, List<String>> integerListEntry = map.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.collectingAndThen(Collectors.toList(),
                        s -> s.stream().map(Map.Entry::getKey)
                                .collect(Collectors.toList()))))
                .entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toList())
                .get(1);
        Map<Integer, List<String>> collect = map.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(
                Map.Entry::getKey, Collectors.toList())));
        Optional<Map.Entry<Integer, List<String>>> first = collect.entrySet().stream().skip(1).findFirst();

        System.out.println(first.get());

    }
}
