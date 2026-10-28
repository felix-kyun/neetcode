class Solution {
    private boolean illegal = false;
    
    public boolean isBalanced(TreeNode root) {
            traverse(root);
            return !illegal;
    }

    private int traverse(TreeNode root) {
        if (root == null) return 0;

        int ld = traverse(root.left);
        int rd = traverse(root.right);

        if (illegal) {
            return -1;
        }
    
        int dmax, dmin;
        if (ld > rd) {
            dmax = ld;
            dmin = rd;
        } else {
            dmax = rd;
            dmin = ld;
        }

        if (dmax - dmin > 1) {
            illegal = true;
        }

        return dmax + 1;
    }
}