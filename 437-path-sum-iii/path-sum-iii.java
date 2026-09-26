/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    int ans;

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;

        helper(root, (long) targetSum);

        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);

        return ans;
    }

    void helper(TreeNode root, long t) {
        if (root == null) return;

        if (root.val == t) ans++;

        helper(root.left, t - root.val);
        helper(root.right, t - root.val);
    }
}