class Solution {
    boolean searchMatrix(int[][] matrix, int key) {
        
        int n = matrix.length;
        int m = matrix[0].length;

        int row = 0;
        int col = m - 1;

        // Start from top-right corner
        while (row < n && col >= 0) {

            if (matrix[row][col] == key) {
                return true;
            }

            // Move left
            else if (matrix[row][col] > key) {
                col--;
            }

            // Move down
            else {
                row++;
            }
        }

        return false;
    }
}