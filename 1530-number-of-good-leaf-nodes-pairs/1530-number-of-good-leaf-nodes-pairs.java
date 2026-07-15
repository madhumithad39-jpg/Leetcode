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
    private int res = 0;
    List<Integer> dDive(TreeNode node, int dist){
        if(node == null) return new ArrayList<>();
        if(node.left == null && node.right == null){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            return temp;
        }
        List<Integer> lLeft = dDive(node.left, dist);
        List<Integer> rLeft = dDive(node.right, dist);
        for(int l:lLeft)
           for(int r:rLeft) if(l+r <= dist) res++;
        List<Integer> level = new ArrayList<>();
        for(int l:lLeft) if(l+1 <= dist) level.add(l+1);
        for(int r:rLeft) if(r+1 <= dist) level.add(r+1);
        return level;
}
    public int countPairs(TreeNode root, int dist) {
        dDive(root, dist);
        return res;
    }
}