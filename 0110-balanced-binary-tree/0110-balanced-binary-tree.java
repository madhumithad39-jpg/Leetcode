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
    static int depth(TreeNode node){
        if(node == null) return 0;
        int lDepth = depth(node.left);
        if(lDepth == -1) return -1;
        int rDepth = depth(node.right);
        if(rDepth == -1) return -1;
        if(Math.abs(lDepth-rDepth) > 1) return -1;
        return Math.max(lDepth, rDepth)+1;
    }
    public boolean isBalanced(TreeNode root) {
        return depth(root) != -1;
    }
}