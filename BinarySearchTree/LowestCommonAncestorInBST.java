package BinarySearchTree;

/*
Problem: Lowest Common Ancestor in a BST
Difficulty: Medium
Link: https://www.geeksforgeeks.org/problems/lowest-common-ancestor-in-a-bst/1

Description:
Given a Binary Search Tree (with all values unique) and two node values n1 and n2. Find the Lowest Common Ancestor.

Time Complexity: O(H)
Space Complexity: O(H)
*/

class Solution {
    Node LCA(Node root, Node n1, Node n2) {
        if (root == null) return null;
        if (root.data > n1.data && root.data > n2.data) {
            return LCA(root.left, n1, n2);
        }
        if (root.data < n1.data && root.data < n2.data) {
            return LCA(root.right, n1, n2);
        }
        return root;
    }
}
