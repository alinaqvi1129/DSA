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
    List<Integer> l1 = new ArrayList<>();
    List<Integer> l2 = new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        helper(root1);
        helper2(root2);
        return check();
    }
    void helper(TreeNode root){
        if(root == null) return;
        if(root.left == null && root.right == null) l1.add(root.val);
        helper(root.left);
        helper(root.right);
    }
    void helper2(TreeNode root){
        if(root == null) return;
        if(root.left == null && root.right == null) l2.add(root.val);
        helper2(root.left);
        helper2(root.right);
    }
    boolean check(){
        if (l1.size() != l2.size()) return false; 
        for (int i = 0; i < l1.size(); i++) {
            if (!l1.get(i).equals(l2.get(i))) return false; 
        }
        return true;
    }
}