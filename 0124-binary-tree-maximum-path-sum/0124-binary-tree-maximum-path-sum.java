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
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        findsum(root);
        return maxSum;
    }
    private int findsum(TreeNode node){
        if(node==null){
            return 0;
        }
        int lSum = Math.max(findsum(node.left),0);
        int rSum = Math.max(findsum(node.right),0);
        int cSum = node.val+lSum+rSum;
        maxSum = Math.max(maxSum, cSum);
        return node.val+Math.max(lSum,rSum);
    }
}