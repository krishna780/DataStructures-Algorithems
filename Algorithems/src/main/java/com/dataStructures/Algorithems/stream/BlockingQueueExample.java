package com.dataStructures.Algorithems.stream;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {
    public static void main(String[] args) throws InterruptedException {
        // Create a BlockingQueue with a capacity of 3
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);

        // Add elements to the queue
        blockingQueue.add("A");
        blockingQueue.add("B");
        blockingQueue.add("C");

        blockingQueue.put("D");

        // Retrieve and remove elements from the queue
        while (!blockingQueue.isEmpty()) {
            try {
                String element = blockingQueue.take();
                System.out.println("Element '" + element + "' removed from the queue.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

