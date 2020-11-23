import javafx.util.Pair;

import java.util.HashMap;

public class LeetCode337 {

    class TreeNode {
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

    HashMap<Pair<TreeNode, Boolean>, Integer> map = new HashMap<>();

    public int rob(TreeNode root) {

        int firstTake = dfs(root, true);
        int firstNoTake = dfs(root, false);

        return Math.max(firstTake, firstNoTake);

    }

    private int dfs(TreeNode root, boolean take) {
        Pair<TreeNode, Boolean> pair = new Pair<>(root, take);
        if (root == null) {
            return 0;
        }
        if (map.containsKey(pair)) return map.get(pair);

        int rightNoTake = dfs(root.right, false);

        int leftNoTake = dfs(root.left, false);
        if (take) {
            map.put(pair, root.val + leftNoTake + rightNoTake);
            return root.val + leftNoTake + rightNoTake;
        }
        int rightTake = dfs(root.right, true);
        int leftTake = dfs(root.left, true);
        int value = Math.max(rightTake, rightNoTake) + Math.max(leftTake, leftNoTake);
        map.put(pair, value);

        return value;

    }


}
