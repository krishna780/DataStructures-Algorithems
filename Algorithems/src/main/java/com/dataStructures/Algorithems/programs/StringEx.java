package com.dataStructures.Algorithems.programs;

import java.util.*;
import java.util.stream.Collectors;

public class StringEx {
    public static void main(String[] args) {
       Integer[] integers= {2,4,5,6,7,9,3};
        List<Integer> collect = Arrays.stream(integers).sorted().collect(Collectors.toList());
        System.out.println(collect);
    }
}
