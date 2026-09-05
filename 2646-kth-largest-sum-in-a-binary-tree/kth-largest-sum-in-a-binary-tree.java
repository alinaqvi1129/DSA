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
    public long kthLargestLevelSum(TreeNode root, int k) {
        PriorityQueue<Long> heap = new PriorityQueue<>(Collections.reverseOrder());
        Queue<TreeNode> q = new LinkedList<>();
        int l = 1;
        q.offer(root);
        while(q.size() > 0){
            int size = q.size();
            long sum = 0;
            for(int i = 0;i<size;i++){
                TreeNode polled = q.poll();
                sum += polled.val;
                if(polled.left != null)q.add(polled.left);
                if(polled.right != null)q.add(polled.right);
            }
            heap.offer(sum);
            l++;
        }
        if(heap.size() < k) return -1;
        for(int i = 1; i< k;i++) heap.poll();
        return heap.poll();
    }
}