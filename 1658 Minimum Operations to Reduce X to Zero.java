import java.util.*;

public class LeetCode1658 {
    public int minOperations(int[] nums, int x) {
        int target = Arrays.stream(nums).sum() - x;
        int size = -1;
        int n = nums.length;

        int left = -1;
        int sum = 0;
        int right = 0;

        while (right < n){
            sum += nums[right];
            while (left + 1 < nums.length && sum > target) {
                left++;
                sum -= nums[left];
            }
            if (sum == target) {
                size = Math.max(size, right - left);
            }
            right++;
        }

        return size < 0 ? -1 : n - size;
    }
}
