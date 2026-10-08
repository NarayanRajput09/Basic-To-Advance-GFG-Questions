package BinarySearchTree;

/*
Problem: k-th smallest/largest element in BST
Difficulty: Medium
Link: https://www.geeksforgeeks.org/problems/kth-largest-element-in-bst/1

Description:
Given a Binary Search Tree. Find the k-th largest element in the given BST.

Time Complexity: O(H + K)
Space Complexity: O(H)
*/

class Solution {
    int count = 0;
    int ans = -1;

    public int kthLargest(Node root, int k) {
        count = 0;
        ans = -1;
        reverseInorder(root, k);
        return ans;
    }

    private void reverseInorder(Node root, int k) {
        if (root == null || count >= k) return;
        reverseInorder(root.right, k);
        count++;
        if (count == k) {
            ans = root.data;
            return;
        }
        reverseInorder(root.left, k);
    }
}
