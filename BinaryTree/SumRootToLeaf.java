
// ProblemNumber :- 129 SumRootToLeafNode

class Solution {

    public int sumNumbers(TreeNode root) {
        return solve(root, 0);
    }

    private int solve(TreeNode root, int current) {

        if (root == null)
            return 0;

        current = current * 10 + root.val;

        // leaf node
        if (root.left == null && root.right == null)
            return current;

        return solve(root.left, current) +
               solve(root.right, current);
    }
}