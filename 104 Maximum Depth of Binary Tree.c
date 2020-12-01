/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
int maxDepth(struct TreeNode* root) {
    int i;
    int dep = 0;
    if(root == NULL){
        return dep;
    }
    i = DFS(root, dep);
    return i;
}

int DFS(struct TreeNode* root, int dep){
    int tmpR;
    int tmpL;
    if(root == NULL){
        return dep;
    }else{
        dep++;
        tmpL = DFS(root->left, dep);
        tmpR = DFS(root->right, dep);
        return tmpR > tmpL ? tmpR : tmpL;
    }
}
