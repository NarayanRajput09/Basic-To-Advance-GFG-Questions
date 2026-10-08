package Graph;

import java.util.ArrayList;

/*
Problem: DFS of Graph
Difficulty: Medium
Link: https://www.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1

Description:
Given a connected undirected graph. Perform a Depth First Traversal of the graph.

Time Complexity: O(V + E)
Space Complexity: O(V)
*/

class Solution {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> dfs = new ArrayList<>();
        boolean[] visited = new boolean[V];
        dfsHelper(0, adj, visited, dfs);
        return dfs;
    }

    private void dfsHelper(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> dfs) {
        visited[node] = true;
        dfs.add(node);

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfsHelper(neighbor, adj, visited, dfs);
            }
        }
    }
}
