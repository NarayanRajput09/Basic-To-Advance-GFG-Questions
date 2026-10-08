// Problem:--

// Matrix Rotation
// 
// Given a matrix, rotate the matrix 90 degrees clockwise.

// Examples
// Matrix:
// 1 2 3
// 4 5 6
// 7 8 9
// After rotation:
// 7 4 1
// 8 5 2
// 9 6 3
// Matrix:
// 1 2
// 3 4
// 5 6
// After rotation:
// 5 3 1
// 6 4 2
// Testing
// Sample Input
// The first line contains ‘T’ denoting the independent test cases.

// For each test case, The first line contains the numbers 'n' and ‘m’ denoting the number of rows and columns respectively.

// The next ‘n’ lines contains ‘m’ space-separated integers denoting elements of a 2-d matrix.

// Expected Output
// For each test case, It contains ‘m’ lines containing ‘n’ space-separated integers denoting the resultant matrix.

// Sample Input
// 2
// 3 3
// 1 2 3
// 4 5 6
// 7 8 9
// 3 2
// 1 2
// 3 4
// 5 6
// Expected Output
// 7 4 1
// 8 5 2
// 9 6 3
// 5 3 1
// 6 4 2
// Sample Input
// 1
// 3 1
// 1
// 2
// 3
// Expected Output
// 3 2 1

// ...............Solution...........

class Solution {
    public void rotate(int[][] matrix) {

        int n = matrix.length;

        // Step 1: Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse every row
        for (int i = 0; i < n; i++) {

            int left = 0;
            int right = n - 1;

            while (left < right) {

                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }
    }
}