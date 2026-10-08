package Searching_and_Sorting;

/*
Problem: Peak Element
Difficulty: Medium
Link: https://www.geeksforgeeks.org/problems/peak-element/1

Description:
Given an array arr[] of integers. An element arr[i] is a peak element if it is not smaller than its neighbours. Find index of any peak element.

Time Complexity: O(log N)
Space Complexity: O(1)
*/

class Solution {
    public int peakElement(int[] arr) {
        int low = 0, high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[mid + 1]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
