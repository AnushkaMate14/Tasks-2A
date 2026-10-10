package DSA_50.Graphs;

import java.util.*;

public class BipartiteGraph_49 {

    static boolean isBipartite(int[][] graph) {

        int n = graph.length;

        int[] color = new int[n];

        Arrays.fill(color, -1);

        for (int start = 0; start < n; start++) {

            if (color[start] != -1)
                continue;

            Queue<Integer> queue = new LinkedList<>();

            queue.add(start);
            color[start] = 0;

            while (!queue.isEmpty()) {

                int node = queue.poll();

                for (int neighbor : graph[node]) {

                    if (color[neighbor] == -1) {

                        color[neighbor] = 1 - color[node];
                        queue.add(neighbor);

                    } else if (color[neighbor] == color[node]) {

                        return false;
                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[][] graph = {
            {1, 3},
            {0, 2},
            {1, 3},
            {0, 2}
        };

        System.out.println(isBipartite(graph));
    }
}