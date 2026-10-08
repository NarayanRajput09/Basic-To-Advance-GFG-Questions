package Arrays;

import java.util.Arrays;

/*
Problem: Triplet Sum in Array
Difficulty: Medium
Link: https://www.geeksforgeeks.org/problems/triplet-sum-in-array-1587115621/1

Description:
Given an array arr and an integer target, find if there is a triplet in arr that sums up to the target.

Time Complexity: O(N^2)
Space Complexity: O(1)
*/

class Solution {
    public static boolean hasTripletSum(int arr[], int target) {
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1, right = n - 1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == target) return true;
                if (sum < target) left++;
                else right--;
            }
        }
        return false;
    }
}
