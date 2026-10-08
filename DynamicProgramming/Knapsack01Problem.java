package DynamicProgramming;

/*
Problem: 0 - 1 Knapsack Problem
Difficulty: Medium
Link: https://www.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1

Description:
Given weights and values of N items, put these items in a knapsack of capacity W to get the maximum total value.

Time Complexity: O(N * W)
Space Complexity: O(W)
*/

class Solution {
    static int knapSack(int capacity, int val[], int wt[]) {
        int[] dp = new int[capacity + 1];
        for (int i = 0; i < val.length; i++) {
            for (int w = capacity; w >= wt[i]; w--) {
                dp[w] = Math.max(dp[w], val[i] + dp[w - wt[i]]);
            }
        }
        return dp[capacity];
    }
}
