package DynamicProgramming;

import java.util.ArrayList;
import java.util.Collections;

/*
Problem: Longest Increasing Subsequence
Difficulty: Medium
Link: https://www.geeksforgeeks.org/problems/longest-increasing-subsequence-1587115620/1

Description:
Given an array of integers arr[], find the length of the longest strictly increasing subsequence (LIS).

Time Complexity: O(N * log N)
Space Complexity: O(N)
*/

class Solution {
    static int lis(int arr[]) {
        ArrayList<Integer> tails = new ArrayList<>();
        for (int x : arr) {
            int idx = Collections.binarySearch(tails, x);
            if (idx < 0) idx = -(idx + 1);
            if (idx == tails.size()) {
                tails.add(x);
            } else {
                tails.set(idx, x);
            }
        }
        return tails.size();
    }
}
