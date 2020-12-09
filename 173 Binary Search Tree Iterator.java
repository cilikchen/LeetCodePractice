import java.util.LinkedList;
import java.util.Queue;

public class LeetCode173 {
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    Queue<TreeNode> Q = new LinkedList<>();
    public void BSTIterator(TreeNode root) {
        inorder(root);
    }

    private void inorder(TreeNode root){
        if(root==null){
            return;
        }
        if(root.left != null){
            inorder(root.left);
        }
        Q.add(root);
        if(root.right != null){
            inorder(root.right);
        }
    }

    public int next() {
        TreeNode node = Q.poll();
        return node.val;

    }

    public boolean hasNext() {
        return !Q.isEmpty();

    }
}
