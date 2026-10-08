package Arrays;

import java.util.ArrayList;

/*
Problem: Indexes of Subarray Sum
Difficulty: Medium
Link: https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1

Description:
Given an array arr[] of non-negative integers and an integer target, find a continuous sub-array which adds to a given number target.

Time Complexity: O(N)
Space Complexity: O(1)
*/

class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> res = new ArrayList<>();
        int left = 0, currentSum = 0;

        for (int right = 0; right < arr.length; right++) {
            currentSum += arr[right];

            while (currentSum > target && left < right) {
                currentSum -= arr[left++];
            }

            if (currentSum == target) {
                res.add(left + 1);
                res.add(right + 1);
                return res;
            }
        }
        res.add(-1);
        return res;
    }
}
