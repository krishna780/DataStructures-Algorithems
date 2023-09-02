package com.dataStructures.Algorithems.Practice;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        long count = Stream.iterate(0, n -> n + 1).limit(1_000_000)
                .filter(ParallelStream::isPrime)
                .peek(System.out::println)
                .count();
        long currentTimeMillis1 = System.currentTimeMillis();

        System.out.println("total "+count +"  "+ (currentTimeMillis1-currentTimeMillis));
    }

    private static boolean isPrime(int integer) {
        if(integer<=1) return false;
        return IntStream.rangeClosed(2,integer/2).noneMatch(i->integer%i==0);
    }
}
