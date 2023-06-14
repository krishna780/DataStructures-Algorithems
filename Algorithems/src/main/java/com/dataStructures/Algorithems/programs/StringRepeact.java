package com.dataStructures.Algorithems.programs;

import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringRepeact {
    public static void main(String[] args) {
        String str="welcome to java Better Butter";

        String[] split = str.split("");

        Map<String, Long> collect = Arrays.stream(split).filter(StringUtils::hasText)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);
    }
}
