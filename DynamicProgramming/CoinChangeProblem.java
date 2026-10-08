package DynamicProgramming;

/*
Problem: Coin Change (Count Ways)
Difficulty: Medium
Link: https://www.geeksforgeeks.org/problems/coin-change2448/1

Description:
Given an integer array coins[ ] representing different denominations of currency and an integer sum, find the number of ways you can make the sum.

Time Complexity: O(N * sum)
Space Complexity: O(sum)
*/

class Solution {
    public int count(int coins[], int sum) {
        int[] dp = new int[sum + 1];
        dp[0] = 1;

        for (int coin : coins) {
            for (int j = coin; j <= sum; j++) {
                dp[j] += dp[j - coin];
            }
        }
        return dp[sum];
    }
}
