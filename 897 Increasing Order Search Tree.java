import java.util.ArrayList;
import java.util.List;

public class LeetCode897 {

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


    public TreeNode increasingBST(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        list = travesal(root, list);
        TreeNode answer = new TreeNode(list.get(0));
        TreeNode front = answer;
        for (int i = 1; i < list.size(); i++) {
            answer.right = new TreeNode(list.get(i));
            answer = answer.right;
        }
        return front;
    }

    public List<Integer> travesal(TreeNode root, List<Integer> list) {
        if (root == null) {
            return list;
        }
        travesal(root.left, list);
        list.add(root.val);
        travesal(root.right, list);
        return list;
    }

}
