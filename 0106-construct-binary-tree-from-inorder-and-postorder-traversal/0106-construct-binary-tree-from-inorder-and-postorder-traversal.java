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
import java.util.Stack;

class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {

        if (inorder == null || postorder == null || inorder.length == 0)
            return null;

        int inorderIndex = inorder.length - 1;
        int postorderIndex = postorder.length - 1;

        Stack<TreeNode> stack = new Stack<>();

        TreeNode root = new TreeNode(postorder[postorderIndex--]);
        stack.push(root);

        while (postorderIndex >= 0) {

            TreeNode node = stack.peek();

            if (node.val != inorder[inorderIndex]) {

                TreeNode right = new TreeNode(postorder[postorderIndex--]);
                node.right = right;
                stack.push(right);

            } else {

                while (!stack.isEmpty() &&
                       stack.peek().val == inorder[inorderIndex]) {
                    node = stack.pop();
                    inorderIndex--;
                }

                if (postorderIndex >= 0) {
                    TreeNode left = new TreeNode(postorder[postorderIndex--]);
                    node.left = left;
                    stack.push(left);
                }
            }
        }

        return root;
    }
}