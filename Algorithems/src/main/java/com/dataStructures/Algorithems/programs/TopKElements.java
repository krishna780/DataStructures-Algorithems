package com.dataStructures.Algorithems.programs;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopKElements {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3,3};
        int k = 2;
       Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
               .entrySet().stream().filter(s->s.getValue().intValue()>=k).forEach(System.out::println);

    }
}
