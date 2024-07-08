package com.dataStructures.Algorithems.top5alg;

import java.util.*;

public class CombineSets {
    public static List<Set<String>> combineSets(List<Set<String>> inputSets) {
        List<Set<String>> combined = new ArrayList<>();

        for (Set<String> s : inputSets) {
            Set<String> newSet = new HashSet<>(s);
            boolean merged = false;

            for (Set<String> combinedSet : combined) {
                Set<String> intersection = new HashSet<>(newSet);
                intersection.retainAll(combinedSet);

                if (!intersection.isEmpty()) {
                    combinedSet.addAll(newSet);
                    merged = true;
                    break;
                }
            }

            if (!merged) {
                combined.add(newSet);
            }
        }

        return combined;
    }

    public static void main(String[] args) {
        List<Set<String>> inputSets = new ArrayList<>();
        inputSets.add(new HashSet<>(Arrays.asList("a", "b")));
        inputSets.add(new HashSet<>(Arrays.asList("c", "d")));
        inputSets.add(new HashSet<>(Arrays.asList("e", "b")));
        inputSets.add(new HashSet<>(Arrays.asList("d", "f")));
        inputSets.add(new HashSet<>(Arrays.asList("a", "g")));


        List<Set<String>> result = combineSets(inputSets);

        for (Set<String> set : result) {
            System.out.println(set);
        }
    }
}


