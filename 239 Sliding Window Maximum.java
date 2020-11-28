import java.util.ArrayDeque;
import java.util.Deque;

public class LeetCode239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();
        int slideCnt = 0;

        for (int i = 0; i < n; i++) {
            if (!dq.isEmpty() && dq.peek() < i - k + 1) {
                dq.poll();
            }
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }
            dq.add(i);
            if (i >= k - 1) {
                ans[slideCnt] = nums[dq.peek()];
                slideCnt++;
            }
        }

        return ans;
    }
}
