package com.dataStructures.Algorithems.stream;


import java.util.*;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class SNSExamples {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 5);
        hashMap.put("Banana", 3);
        hashMap.put("Orange", 8);
        hashMap.put("Grapes", 2);

        // Create an ArrayList of keys to filter by
        List<String> keysToFilter = new ArrayList<>();
        keysToFilter.add("Apple");
        keysToFilter.add("Orange");
        keysToFilter.add("Banana");
       // extracted(hashMap, keysToFilter);
        //extracted(keysToFilter);
        extracted();

        List<Integer> collect = IntStream.range(1, 10).map(s -> s * s)
                .boxed().collect(toList());
        System.out.println(collect);
    }

    private static void extracted() {
        List<Integer> integers=Arrays.asList(4,2,7,9,12,3);
        Optional<Integer> max = integers.stream().max(Comparator.naturalOrder());
        max.ifPresentOrElse(System.out::println,null );
    }

    private static void extracted(Map<String, Integer> hashMap, List<String> keysToFilter) {
        hashMap.entrySet().stream()
                .filter(s-> keysToFilter.contains(s.getKey()))
                .forEach(System.out::println);
    }

    private static void extracted(List<String> keysToFilter) {
        keysToFilter.stream().filter(s->s.endsWith("e"))
                .forEach(System.out::println);
    }
}
