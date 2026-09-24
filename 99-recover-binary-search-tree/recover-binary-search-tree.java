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
    List<Integer> l = new ArrayList<>();
    public void recoverTree(TreeNode root) {
        helper(root);
        Collections.sort(l);
        helper1(root);
    }
    void helper(TreeNode root){
        if(root == null) return;
        helper(root.left);
        l.add(root.val);
        helper(root.right);
    }
    void helper1(TreeNode root){
        if(root == null) return;
        helper1(root.left);
        root.val = l.get(i++);
        helper1(root.right);
    }
}