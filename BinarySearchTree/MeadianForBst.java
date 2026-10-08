package BinarySearchTree;

import java.util.ArrayList;

/*
Problem: Median of BST
Given a Binary Search Tree of size N, find the Median of its Node values in O(N) time and O(1) or O(N) space.

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

class Tree {
    public static void inorder(Node root, ArrayList<Integer> list) {
        if (root == null) return;
        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }

    public static float findMedian(Node root) {
        // code here
        if (root == null) return 0;
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);

        int n = list.size();
        if (n % 2 != 0) {
            return (float) list.get(n / 2);
        } else {
            return (float) (list.get(n / 2 - 1) + list.get(n / 2)) / 2.0f;
        }
    }
}
