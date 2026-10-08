package DynamicProgramming;

/*
Problem: Longest Common Subsequence
Difficulty: Medium
Link: https://www.geeksforgeeks.org/problems/longest-common-subsequence-1587115620/1

Description:
Given two strings s1 and s2, return the length of their longest common subsequence (LCS).

Time Complexity: O(N * M)
Space Complexity: O(N * M)
*/

class Solution {
    static int lcs(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        int[][] dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n][m];
    }
}
