package Arrays;

import java.util.ArrayList;

/*
Problem: Spirally traversing a matrix
Difficulty: Medium
Link: https://www.geeksforgeeks.org/problems/spirally-traversing-a-matrix-1587115621/1

Description:
Given a matrix of size r*c. Traverse the matrix in spiral form.

Time Complexity: O(R * C)
Space Complexity: O(1)
*/

class Solution {
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        ArrayList<Integer> res = new ArrayList<>();
        int top = 0, bottom = mat.length - 1;
        int left = 0, right = mat[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) res.add(mat[top][j]);
            top++;
            for (int i = top; i <= bottom; i++) res.add(mat[i][right]);
            right--;
            if (top <= bottom) {
                for (int j = right; j >= left; j--) res.add(mat[bottom][j]);
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) res.add(mat[i][left]);
                left++;
            }
        }
        return res;
    }
}
