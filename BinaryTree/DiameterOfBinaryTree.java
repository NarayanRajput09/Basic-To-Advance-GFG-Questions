package BinaryTree;

/*
Problem: Diameter of a Binary Tree
Difficulty: Medium
Link: https://www.geeksforgeeks.org/problems/diameter-of-binary-tree/1

Description:
The diameter of a tree is the number of edges on the longest path between two leaf nodes.

Time Complexity: O(N)
Space Complexity: O(H)
*/

class Solution {
    int maxDiameter = 0;

    int diameter(Node root) {
        maxDiameter = 0;
        height(root);
        return maxDiameter;
    }

    private int height(Node root) {
        if (root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        maxDiameter = Math.max(maxDiameter, lh + rh);
        return 1 + Math.max(lh, rh);
    }
}
