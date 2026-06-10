package BinarySearchTree;

// public class MinimumBST {
    
// }

// Problem:-Minimum Binary Search Tree

// Given the root of a Binary Search Tree, find the minimum element in this given BST.


// Input: root = [5, 4, 6, 3, N, N, 7, 1]
// ex-1
// Output: 1
// Explanation: The minimum element in the given BST is 1.
// Input: root = [10, 5, 20, 2]
// ex-2
// Output: 2
// Explanation: The minimum element in the given BST is 2.
// Input: root = []
// Output: -1
// Explanation: The root of the BST is NULL.
// Constraints:
// 0 ≤ number of nodes ≤ 105
// 0 ≤ node->data ≤ 105


// Solution:-

/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
*/

class Solution {
    public int minValue(Node root) {
        // code here
        if(root==null)
        return-1;
        while(root.left!=null){
            root= root.left;
        }
        return root.data;
    }
}