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
    String ans = null;

public String smallestFromLeaf(TreeNode root) {
    StringBuilder sb = new StringBuilder();
    helper(root, sb);
    return ans;
}

void helper(TreeNode root, StringBuilder sb) {
    if (root == null) return;

    int len = sb.length();

    sb.append((char) ('a' + root.val));

    if (root.left == null && root.right == null) {
        String current = sb.reverse().toString();

        if (ans == null || current.compareTo(ans) < 0) {
            ans = current;
        }

        sb.reverse();
    } else {
        helper(root.left, sb);
        helper(root.right, sb);
    }

    sb.setLength(len);
}
}