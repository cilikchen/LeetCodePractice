public class LeetCode59 {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int up =0;
        int down = n-1;
        int left =0;
        int right =n-1;

        int add =1;

        while (up<=down || left <= right){
            for(int i= left; i<=right;i++){
                ans[up][i] =add;
                add++;
            }
            up++;
            for(int i =up; i<=down;i++){
                ans[i][right] =add;
                add++;
            }
            right--;
            for(int i =right; i>=left ; i--){
                ans[down][i] =add;
                add++;
            }
            down--;
            for(int i =down;i>=up;i--){
                ans[i][left] =add;
                add++;
            }
            left++;
        }

        return ans;
    }
}
