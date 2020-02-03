package io.theforloop.google.practice.treeAndGraphs;

import java.util.*;

/**
 * @author Shubham
 */
/*
* https://leetcode.com/problems/filter-restaurants-by-vegan-friendly-price-and-distance/
* */
public class SmallestNumberofNeighbors {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        Map<Integer, Map<Integer,Integer>> adjList = new HashMap<>();
        for(int[] e : edges){
            Map<Integer,Integer> map1 = adjList.getOrDefault(e[0],new HashMap<>());
            map1.put(e[1],e[2]);
            adjList.put(e[0],map1);

            Map<Integer,Integer> map2 = adjList.getOrDefault(e[1],new HashMap<>());
            map2.put(e[0],e[2]);
            adjList.put(e[1],map2);
        }
        int min = n + 1;
        int res = -1;
        for (int i = 0; i < n; i++) {
            Queue<int[]> q = new PriorityQueue<>((a, b)->(b[1] - a[1]));
            q.add(new int[]{i, distanceThreshold});
            Set<Integer> visited = new HashSet<>();
            int count = 0;
            while (!q.isEmpty()) {
                int[] city = q.poll();
                if (!visited.contains(city[0])) {
                    visited.add(city[0]);
                    count++;
                } else {
                    continue;
                }
                Map<Integer, Integer> m = adjList.getOrDefault(city[0],new HashMap<>());
                for (int neighbor : m.keySet()) {
                    if (!visited.contains(neighbor) && city[1] >= m.get(neighbor)) {
                        q.add(new int[]{neighbor, city[1] - m.get(neighbor)});
                    }
                }
            }
            if (count - 1 <= min) {
                min = count - 1;
                res = i;
            }
        }
        return res;
    }

}
