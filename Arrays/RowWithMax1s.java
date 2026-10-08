package Arrays;

/*
Problem: Row with max 1s
Difficulty: Medium
Link: https://www.geeksforgeeks.org/problems/row-with-max-1s0023/1

Description:
Given a boolean 2D array of n x m dimensions, where each row is sorted. Find the 0-based index of the first row that has the maximum number of 1's.

Time Complexity: O(N + M)
Space Complexity: O(1)
*/

class Solution {
    public int rowWithMax1s(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        int maxRow = -1;
        int j = m - 1;

        for (int i = 0; i < n; i++) {
            while (j >= 0 && arr[i][j] == 1) {
                j--;
                maxRow = i;
            }
        }
        return maxRow;
    }
}
