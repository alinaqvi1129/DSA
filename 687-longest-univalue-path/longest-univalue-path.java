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

    int max = 0;

    public int longestUnivaluePath(TreeNode root) {
        helper(root);
        return max;
    }

    int helper(TreeNode root) {
        if (root == null) return 0;

        int left = helper(root.left);
        int right = helper(root.right);

        int l = 0;
        int r = 0;

        if (root.left != null && root.left.val == root.val) {
            l = left + 1;
        }

        if (root.right != null && root.right.val == root.val) {
            r = right + 1;
        }

        max = Math.max(max, l + r);

        return Math.max(l, r);
    }
}