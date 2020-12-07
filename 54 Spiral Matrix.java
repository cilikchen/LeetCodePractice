import java.util.*;

public class LeetCode54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new LinkedList<>();
        int up = 0;
        int down = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        boolean[][] map = new boolean[down + 1][right + 1];
        while (up <= down || left <= right) {
            if (up <= down) {
                for (int i = left; i <= right; i++) {
                    if (map[up][i]) {
                        break;
                    }
                    ans.add(matrix[up][i]);
                    map[up][i] = true;
                }
            }
            up++;
            if (right >= 0) {
                for (int i = up; i <= down; i++) {
                    if (map[i][right]) {
                        break;
                    }
                    ans.add(matrix[i][right]);
                    map[i][right] = true;

                }
            }
            right--;
            if (down >= 0) {
                for (int i = right; i >= left; i--) {
                    if (map[down][i]) {
                        break;
                    }
                    ans.add(matrix[down][i]);
                    map[down][i] = true;
                }
            }
            down--;
            if (left <= right) {
                for (int i = down; i >= up; i--) {
                    if (map[i][left]) {
                        break;
                    }
                    ans.add(matrix[i][left]);
                    map[i][left] = true;
                }
            }
            left++;
        }
        return ans;
    }
}
