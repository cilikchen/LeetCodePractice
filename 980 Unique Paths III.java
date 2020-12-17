import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class LeetCode980 {


    int res;
    public int uniquePathsIII(int[][] grid) {
        int sX =0;
        int sY =0;
        int wrokLength =0;
        for(int i =0; i< grid.length;i++){
            for(int j = 0; j< grid[0].length ; j++){
                if(grid[i][j] == 0){
                    wrokLength++;
                }
                if(grid[i][j] == 1){
                    sX =i;
                    sY=j;
                }
            }
        }

        dfs(grid,sX,sY,wrokLength+1);

        return res;
    }


    private void dfs(int[][] grid, int x, int y,int empty) {
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] < 0)
            return;
        if (grid[x][y] == 2) {
            if (empty == 0) res++;
            return;
        }
        grid[x][y] = -2;
        empty--;
        dfs(grid, x + 1, y,empty);
        dfs(grid, x - 1, y,empty);
        dfs(grid, x, y + 1,empty);
        dfs(grid, x, y - 1,empty);
        grid[x][y] = 0;
        empty++;

    }
}
