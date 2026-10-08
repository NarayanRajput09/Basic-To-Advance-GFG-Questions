package Searching_and_Sorting;

/*
Problem: Search in Rotated Sorted Array
Difficulty: Medium
Link: https://www.geeksforgeeks.org/problems/search-in-a-rotated-array4618/1

Description:
Given a sorted and rotated array arr[] of distinct elements, find the index of a given key.

Time Complexity: O(log N)
Space Complexity: O(1)
*/

class Solution {
    int search(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) return mid;

            if (arr[low] <= arr[mid]) {
                if (key >= arr[low] && key < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (key > arr[mid] && key <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
