package Arrays;

import java.util.HashSet;

/*
Problem: Longest Consecutive Subsequence
Difficulty: Medium
Link: https://www.geeksforgeeks.org/problems/longest-consecutive-subsequence2449/1

Description:
Given an array arr[] of non-negative integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers.

Time Complexity: O(N)
Space Complexity: O(N)
*/

class Solution {
    public int longestConsecutive(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) set.add(num);

        int maxLen = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currNum = num;
                int currentStreak = 1;
                while (set.contains(currNum + 1)) {
                    currNum++;
                    currentStreak++;
                }
                maxLen = Math.max(maxLen, currentStreak);
            }
        }
        return maxLen;
    }
}
