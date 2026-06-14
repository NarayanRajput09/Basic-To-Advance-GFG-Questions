// package BinarySearchTree;

// public class SumOfKthElementBST {
    
// }


class Solution {

    int sum = 0;
    int count = 0;

    int sum(Node root, int k) {

        dfs(root, k);
        return sum;
    }

    void dfs(Node root, int k) {

        if (root == null || count >= k) {
            return;
        }

        // Left subtree
        dfs(root.left, k);

        // Root node
        if (count < k) {
            sum += root.data;
            count++;
        }

        // Right subtree
        dfs(root.right, k);
    }

}