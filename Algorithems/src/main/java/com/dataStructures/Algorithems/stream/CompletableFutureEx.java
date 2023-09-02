package com.dataStructures.Algorithems.stream;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureEx {
    public static void main(String[] args) {
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> 10);

        Integer join = future1.thenCompose(result -> {
            // Simulate an asynchronous operation that uses the result of future1
            return CompletableFuture.supplyAsync(() -> {
                        return  result * 2;

                    }
            );
        }).join();
        System.out.println(join);

    }
}
