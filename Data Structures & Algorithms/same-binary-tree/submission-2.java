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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return dfs(p, q);
    }
    private boolean dfs(TreeNode p, TreeNode q) {
        if (p == null & q == null) {
            return true;
        } 
        if (p == null & q != null) {
            return false;
        }
        if (q == null & p != null) {
            return false;
        }
        if (q.val != p.val) {
            return false;
        }
        if (dfs(p.left, q.left) && dfs(p.right, q.right)) {
            return true;
        }
        return false;
    }
}
