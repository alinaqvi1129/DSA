/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    HashMap<TreeNode, TreeNode> map = new HashMap<>();
    List<Integer> ans = new ArrayList<>();
    HashSet<TreeNode> set = new HashSet<>();

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        helper(root, null);
        dfs(target, k);
        return ans;
    }

    void helper(TreeNode root, TreeNode parent) {
        if (root == null) return;
        map.put(root, parent);
        helper(root.left, root);
        helper(root.right, root);
    }

    void dfs(TreeNode root, int k) {
        if (root == null || set.contains(root)) return;

        set.add(root);

        if (k == 0) {
            ans.add(root.val);
            return;
        }

        dfs(root.left, k - 1);
        dfs(root.right, k - 1);
        dfs(map.get(root), k - 1);
    }
}