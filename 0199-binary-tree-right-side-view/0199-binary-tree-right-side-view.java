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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root==null) return result;
        Deque<TreeNode> que = new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            result.add(que.peekLast().val);
            Deque<TreeNode> byLevel = new LinkedList<>();
            while(!que.isEmpty()){
                TreeNode node = que.pollFirst();
                if(node.left != null){
                    byLevel.offer(node.left);
                }
                if(node.right != null){
                    byLevel.offer(node.right);
                }
            }
            que = byLevel;
        }
        return result;
    }
}