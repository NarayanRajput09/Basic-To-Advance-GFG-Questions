package Arrays;

import java.util.PriorityQueue;
import java.util.Collections;

/*
Problem: Kth Smallest Element
Difficulty: Medium
Link: https://www.geeksforgeeks.org/problems/kth-smallest-element5635/1

Description:
Given an array arr[] and an integer k, find the kth smallest element in the given array.

Time Complexity: O(N * log K)
Space Complexity: O(K)
*/

class Solution {
    public static int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int val : arr) {
            maxHeap.add(val);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        return maxHeap.peek();
    }
}
