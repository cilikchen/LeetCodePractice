import apple.laf.JRSUIUtils;

import java.util.Stack;

public class LeetCode173_v2 {
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
        Stack<TreeNode> stack;
    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        TreeNode current = root;

        while (current!=null){
            stack.push(current);
            current = current.left;
        }

    }

    public int next() {
        TreeNode current = stack.pop();
        int ans = current.val;
        if(current.right!=null){
            TreeNode temp = current.right;
            while (temp != null){
                stack.add(temp);
                temp=temp.left;
            }
        }
        return ans;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }
}
