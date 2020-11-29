import java.util.Arrays;

public class LeetCode1306 {
    private int[] map;

    public boolean canReach(int[] arr, int start) {
        map = Arrays.copyOf(arr, arr.length);
        return dfs(start);
    }

    boolean dfs(int index) {
        if (index < 0 || index >= map.length) {
            return false;
        }
        if (map[index] == -1) {
            return false;
        }
        if (map[index] == 0) {
            return true;
        }
        int goRight = index + map[index];
        int goLeft = index - map[index];
        map[index] = -1;
        return dfs(goLeft) || dfs(goRight);
    }
}
