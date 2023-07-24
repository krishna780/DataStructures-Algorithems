package com.dataStructures.Algorithems.top5alg;


import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindMostFrequentNum {
    public static void main(String[] args) {
        int[] ints = {1, 1, 2, 2, 3, 1, 3, 4, 5};
     Arrays.stream(ints).boxed()
             .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
             .filter(s -> s.getValue().intValue() >= 2).forEach(System.out::println);

    }
}
