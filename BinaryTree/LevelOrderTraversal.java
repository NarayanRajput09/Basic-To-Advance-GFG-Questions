package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
Problem: Level order traversal
Difficulty: Medium
Link: https://www.geeksforgeeks.org/problems/level-order-traversal/1

Description:
Given the root of a binary tree, return the level order traversal of its nodes' values.

Time Complexity: O(N)
Space Complexity: O(N)
*/

class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            ArrayList<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node curr = q.poll();
                level.add(curr.data);
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            result.add(level);
        }
        return result;
    }
}
