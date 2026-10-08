package Recursion_and_Backtracking;

import java.util.ArrayList;
import java.util.Collections;

/*
Problem: Rat in a Maze Problem - I
Difficulty: Medium
Link: https://www.geeksforgeeks.org/problems/rat-in-a-maze-problem/1

Description:
Consider a rat placed at (0, 0) in a square matrix mat of order n*n. Find all possible paths the rat can take to reach (n-1, n-1).

Time Complexity: O(4^(N^2))
Space Complexity: O(N^2)
*/

class Solution {
    public ArrayList<String> findPath(int[][] mat) {
        ArrayList<String> res = new ArrayList<>();
        int n = mat.length;
        if (mat[0][0] == 0 || mat[n - 1][n - 1] == 0) return res;

        boolean[][] visited = new boolean[n][n];
        solve(0, 0, mat, n, "", res, visited);
        Collections.sort(res);
        return res;
    }

    private void solve(int r, int c, int[][] mat, int n, String path, ArrayList<String> res, boolean[][] visited) {
        if (r == n - 1 && c == n - 1) {
            res.add(path);
            return;
        }

        visited[r][c] = true;

        // Down, Left, Right, Up
        int[] dr = {1, 0, 0, -1};
        int[] dc = {0, -1, 1, 0};
        char[] dir = {'D', 'L', 'R', 'U'};

        for (int i = 0; i < 4; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];
            if (nr >= 0 && nr < n && nc >= 0 && nc < n && mat[nr][nc] == 1 && !visited[nr][nc]) {
                solve(nr, nc, mat, n, path + dir[i], res, visited);
            }
        }
        visited[r][c] = false;
    }
}
