/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
bool mirror(struct TreeNode* node1, struct TreeNode* node2){
    if(!node1 && !node2) return true;

    if(!node1 || !node2) return false;

    if(node1->val != node2->val) return false;

    return mirror(node1->left, node2->right) && mirror(node1->right, node2->left);
}
bool isSymmetric(struct TreeNode* root) {
    if(!root) return true;
    return mirror(root->left, root->right);
}