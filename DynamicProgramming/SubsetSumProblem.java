package DynamicProgramming;

/*
Problem: Subset Sum Problem
Difficulty: Medium
Link: https://www.geeksforgeeks.org/problems/subset-sum-problem-1611555638/1

Description:
Given an array of non-negative integers and a value target, determine if there is a subset of the given set with sum equal to given target.

Time Complexity: O(N * target)
Space Complexity: O(target)
*/

class Solution {
    static Boolean isSubsetSum(int arr[], int target) {
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        for (int num : arr) {
            for (int j = target; j >= num; j--) {
                dp[j] = dp[j] || dp[j - num];
            }
        }
        return dp[target];
    }
}
