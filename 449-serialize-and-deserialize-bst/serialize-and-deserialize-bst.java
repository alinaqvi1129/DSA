/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        helper(root, sb);
        return sb.toString();
    }
    void helper(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("#,");
            return;
        }

        sb.append(root.val).append(",");
        helper(root.left, sb);
        helper(root.right, sb);
    }

    int i = 0;

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        i = 0;
        return helper2(data);
    }
    TreeNode helper2(String data) {
        // Find the next comma
        int j = data.indexOf(',', i);

        String value = data.substring(i, j);

        // Move index after comma
        i = j + 1;

        if (value.equals("#")) {
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(value));

        node.left = helper2(data);
        node.right = helper2(data);

        return node;
    }
    
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;