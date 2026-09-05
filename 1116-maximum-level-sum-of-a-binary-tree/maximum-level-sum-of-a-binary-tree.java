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
    public int maxLevelSum(TreeNode root) {
        int l = 1;
        int maxl = 1;
        int maxc = Integer.MIN_VALUE;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(q.size() > 0){
            int size = q.size();
            int sum = 0;
            for(int i = 0;i<size;i++){
                TreeNode polled = q.poll();
                sum += polled.val;
                if(polled.left != null)q.add(polled.left);
                if(polled.right != null)q.add(polled.right);
            }
            if(sum > maxc){
                maxc = sum;
                maxl = l;
            }
            l++;
        }
        return maxl;
    }
}