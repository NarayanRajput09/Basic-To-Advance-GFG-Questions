package Arrays;

/*
Problem: Majority Element
Difficulty: Medium
Link: https://www.geeksforgeeks.org/problems/majority-element-1587115620/1

Description:
Given an array arr. Find the majority element in the array. If no majority exists, return -1.

Time Complexity: O(N)
Space Complexity: O(1)
*/

class Solution {
    static int majorityElement(int arr[]) {
        int candidate = -1, votes = 0;
        for (int num : arr) {
            if (votes == 0) {
                candidate = num;
                votes = 1;
            } else if (num == candidate) {
                votes++;
            } else {
                votes--;
            }
        }
        int count = 0;
        for (int num : arr) {
            if (num == candidate) count++;
        }
        return (count > arr.length / 2) ? candidate : -1;
    }
}
