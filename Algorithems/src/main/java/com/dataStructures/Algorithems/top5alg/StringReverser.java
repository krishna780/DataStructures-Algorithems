package com.dataStructures.Algorithems.top5alg;

public class StringReverser {
    public static String reverseStringRecursive(String input) {
        if (input == null || input.length() <= 1) {
            return input;
        }
        return reverseStringRecursive(input.substring(1))+input.charAt(0);

    }

    public static void main(String[] args) {
        String original = "Hello, world!";
        String reversed = reverseStringRecursive(original);
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}
