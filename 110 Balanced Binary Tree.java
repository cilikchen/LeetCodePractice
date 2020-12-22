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
    
    public boolean isBalanced(TreeNode root) {
        
        return heightDiff(root , 0)>=0 ? true : false;
    }
       
    private int heightDiff(TreeNode root, int depth){
        if (root == null)
    {
        return depth;
    }
    
    int leftTree = heightDiff(root.left, depth + 1);
    int rightTree = heightDiff(root.right, depth + 1);
    if (Math.abs(leftTree - rightTree) > 1)
    {
        return -1;
    }
    
    return Math.max(leftTree, rightTree);
    }
    
    
}
