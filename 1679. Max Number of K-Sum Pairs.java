import java.util.*;

public class LeetCode1679 {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int x = entry.getKey();
            if (map.containsKey(k - x)) {
                ans += Math.min(entry.getValue(), map.get(k - x));
            }
        }
        return ans / 2;

    }
}
