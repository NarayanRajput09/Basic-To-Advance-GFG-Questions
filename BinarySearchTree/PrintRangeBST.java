package BinarySearchTree;

import java.util.ArrayList;

/*
Problem: Print BST elements in given range
Given a Binary Search Tree and two integers. The task is to return the elements in the given range [low, high] in sorted, ascending order.

Definition for Node:
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
    // Function to return a list of BST elements in a given range.
    public static ArrayList<Integer> printNearNodes(Node root, int low, int high) {
        ArrayList<Integer> result = new ArrayList<>();
        helper(root, low, high, result);
        return result;
    }

    private static void helper(Node root, int low, int high, ArrayList<Integer> result) {
        if (root == null) return;

        // If root's data is greater than low, then only we can get nodes on left side
        if (root.data > low) {
            helper(root.left, low, high, result);
        }

        // If root's data lies in range, add it
        if (root.data >= low && root.data <= high) {
            result.add(root.data);
        }

        // If root's data is smaller than high, then only we can get nodes on right side
        if (root.data < high) {
            helper(root.right, low, high, result);
        }
    }
}
