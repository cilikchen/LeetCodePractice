public class LeetCode55_v2 {
    public boolean canJump(int[] nums) {
        int reachable = 0;
        int len = nums.length;
        for (int i = 0; i < len && i <= reachable; i++) {
            reachable = Math.max(reachable, i + nums[i]);
            if (reachable >= len - 1) return true;
        }
        return false;

    }
}
