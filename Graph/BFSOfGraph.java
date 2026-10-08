package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
Problem: BFS of graph
Difficulty: Medium
Link: https://www.geeksforgeeks.org/problems/bfs-traversal-of-graph/1

Description:
Given a connected undirected graph represented by an adjacency list. Perform a Breadth First Traversal of the graph.

Time Complexity: O(V + E)
Space Complexity: O(V)
*/

class Solution {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        visited[0] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            bfs.add(node);

            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
        return bfs;
    }
}
