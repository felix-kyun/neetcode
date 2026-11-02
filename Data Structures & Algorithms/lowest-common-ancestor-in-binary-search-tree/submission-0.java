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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> a = findNode(root, p.val);
        List<TreeNode> b = findNode(root, q.val);

        TreeNode current = null;
        for (int i = 0; i < Math.min(a.size(), b.size()); i++) {
            if (a.get(i) == b.get(i)) {
                current = a.get(i);
            }
        }

        return current;
    }

    private List<TreeNode> findNode(TreeNode root, int target) {
        List<TreeNode> list = new ArrayList<>();

        var current = root;
        list.add(current);
        while (current.val != target) {
            if (target < current.val) {
                current = current.left;
            } else {
                current = current.right;
            }
            list.add(current);
        }

        return list;
    }
}
