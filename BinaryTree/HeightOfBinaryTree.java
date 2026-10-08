package BinaryTree;

/*
Problem: Height of Binary Tree
Difficulty: Medium
Link: https://www.geeksforgeeks.org/problems/height-of-binary-tree/1

Description:
Given a binary tree, find its height.

Time Complexity: O(N)
Space Complexity: O(H)
*/

class Solution {
    int height(Node node) {
        if (node == null) return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }
}
