package BinaryTree;

/*
Problem: Lowest Common Ancestor in a Binary Tree
Difficulty: Medium
Link: https://www.geeksforgeeks.org/problems/lowest-common-ancestor-in-a-binary-tree/1

Description:
Given a Binary Tree with all unique values and two nodes value, n1 and n2. Find the Lowest Common Ancestor.

Time Complexity: O(N)
Space Complexity: O(H)
*/

class Solution {
    Node lca(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        Node left = lca(root.left, n1, n2);
        Node right = lca(root.right, n1, n2);

        if (left != null && right != null) return root;
        return (left != null) ? left : right;
    }
}
