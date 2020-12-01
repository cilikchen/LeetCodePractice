public class LeetCode104 {
    private class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public int maxDepth(TreeNode root) {
        int depth =0;
        if(root ==null){
            return depth;
        }
        return dfs(root,depth);

    }

    private int dfs(TreeNode root, int depth){
        if(root==null) return depth;
        depth++;
        return Math.max(dfs(root.left,depth), dfs(root.right,depth));
    }
}
