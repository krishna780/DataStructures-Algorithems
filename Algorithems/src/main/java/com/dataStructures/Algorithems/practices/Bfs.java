package com.dataStructures.Algorithems.practices;

import java.util.*;

public class Bfs {
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

    private static void bfs(Map<Integer, List<Integer>> graph, int startNode) {

        Queue<Integer> queue=new ArrayDeque<>();
        Set<Integer> set=new HashSet<>();
        queue.offer(startNode);
        set.add(startNode);
        while (!queue.isEmpty()){
            Integer currentNode = queue.poll();
            System.out.println(currentNode+ " ");
            List<Integer> list = graph.getOrDefault(currentNode, new ArrayList<>());
            for (int i:list){
                if(!set.contains(i)){
                    queue.offer(i);
                    set.add(i);
                }
            }
        }
    }
}
