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
    int i = 0;
    int j = 0;

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        i = 0;
        j = 0;
        return helper(preorder, postorder);
    }

    TreeNode helper(int[] preorder, int[] postorder) {
        TreeNode root = new TreeNode(preorder[i++]);

        if (root.val != postorder[j]) {
            root.left = helper(preorder, postorder);
        }

        if (root.val != postorder[j]) {
            root.right = helper(preorder, postorder);
        }

        j++;
        return root;
    }
}