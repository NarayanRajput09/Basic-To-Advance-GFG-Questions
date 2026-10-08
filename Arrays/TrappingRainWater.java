package Arrays;

/*
Problem: Trapping Rain Water
Difficulty: Medium
Link: https://www.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1

Description:
Given an array arr[] of non-negative integers representing the height of blocks. Compute how much water it is able to trap after raining.

Time Complexity: O(N)
Space Complexity: O(1)
*/

class Solution {
    public int maxWater(int arr[]) {
        int left = 0, right = arr.length - 1;
        int leftMax = 0, rightMax = 0;
        int trappedWater = 0;

        while (left <= right) {
            if (arr[left] <= arr[right]) {
                if (arr[left] >= leftMax) {
                    leftMax = arr[left];
                } else {
                    trappedWater += leftMax - arr[left];
                }
                left++;
            } else {
                if (arr[right] >= rightMax) {
                    rightMax = arr[right];
                } else {
                    trappedWater += rightMax - arr[right];
                }
                right--;
            }
        }
        return trappedWater;
    }
}
