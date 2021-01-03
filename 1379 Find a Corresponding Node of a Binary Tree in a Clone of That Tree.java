/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original == target){
            return cloned;
        }
        if(original == null){
            return null;
        }
        TreeNode right = getTargetCopy(original.right , cloned.right , target);
        TreeNode left = getTargetCopy(original.left , cloned.left , target);
        
        return right != null ? right : left != null ? left : null;
        
    }
}
