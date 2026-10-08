package BinarySearchTree;

/*
Problem: Check for BST
Difficulty: Medium
Link: https://www.geeksforgeeks.org/problems/check-for-bst/1

Description:
Given the root of a binary tree. Check whether it is a BST or not.

Time Complexity: O(N)
Space Complexity: O(H)
*/

class Solution {
    boolean isBST(Node root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    boolean isValid(Node root, long min, long max) {
        if (root == null) return true;
        if (root.data <= min || root.data >= max) return false;
        return isValid(root.left, min, root.data) && isValid(root.right, root.data, max);
    }
}
