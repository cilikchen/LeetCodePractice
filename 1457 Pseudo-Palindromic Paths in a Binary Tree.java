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
    int ans;
    int[] map;
    public int pseudoPalindromicPaths (TreeNode root) {
        ans = 0;
        map = new int[9];
        
        dfs(root);
        
        return ans;
        
    }
    private void dfs(TreeNode root){

        map[root.val -1]++;
        
        if(root.left ==null && root.right == null){
            check();
        
        }

        if(root.left!=null){
            dfs(root.left);
        }
        
        if(root.right != null){
            dfs(root.right);
        }
        map[root.val -1]--;
        
    }
    
    
    private void check(){
        int k = 0;
        for(int x:map){
            if(x%2 ==1){
                k++;
            }
        }
        if(k<2){
            ans++;
        }
    }
}
