package com.dataStructures.Algorithems.stream;

import java.util.ArrayList;
import java.util.List;

public class ArrayEx {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(123);
        list.add(234);
        Object[] array = list.toArray();
        System.out.println(array);
    }
}
