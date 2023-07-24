package com.dataStructures.Algorithems.top5alg;

import java.util.*;

public class BFS {
    public static void bfs(Map<Integer, List<Integer>> graph, int startNode) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(startNode);
        visited.add(startNode);

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            System.out.print(currentNode + " ");

            List<Integer> neighbors = graph.getOrDefault(currentNode, new ArrayList<>());
            for (int neighbor : neighbors) {
                if (!visited.contains(neighbor)) {
                    queue.offer(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, Arrays.asList(2, 3));
        graph.put(2, Arrays.asList(1, 3, 4));
        graph.put(3, Arrays.asList(1, 2, 4, 5));
        graph.put(4, Arrays.asList(2, 3, 5));
        graph.put(5, Arrays.asList(3, 4));

        int startNode = 4; // Starting node for BFS
        System.out.println("Breadth-First Traversal from node " + startNode + ":");
        bfs(graph, startNode);
    }
}

