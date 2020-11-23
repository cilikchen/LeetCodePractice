
class Solution {
    public int rob(TreeNode root) {
        
        int firstTake = dfs(root, true);
        int firstNoTake = dfs(root, false);
        
        return Math.max(firstTake, firstNoTake);

    }
    
    private int dfs(TreeNode root, boolean take){
        if(root==null){
            return 0;
        }
        if(take){
            return root.val + dfs(root.left,false) + dfs(root.right,false);
        }
        
        int rightTake = dfs(root.right,true);
        int rightNoTake = dfs(root.right, false);
        int leftTake = dfs(root.left,true);
        int leftNoTake = dfs(root.left, false);
        
        return Math.max(rightTake,rightNoTake) + Math.max(leftTake,leftNoTake);
        
    }
}
