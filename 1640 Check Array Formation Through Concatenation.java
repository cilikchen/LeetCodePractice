import java.util.*;

public class LeetCode1640 {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        int n = arr.length;
        Map<Integer, int[]> map = new HashMap<>();
        for (int[] p : pieces) {
            map.put(p[0], p);
        }

        int i = 0;

        while (i < n) {
            if (!map.containsKey(arr[i])) {
                return false;
            }
            int[] target = map.get(arr[i]);
            for (int x : target) {
                if (x != arr[i]) {
                    return false;
                }
                i++;
            }
        }

        return true;

    }
}
