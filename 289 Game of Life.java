public class LeetCode289 {
    public void gameOfLife(int[][] board) {
        int row = board.length;
        int col = board[0].length;

        int[][] newMap = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                newMap[i][j] = board[i][j];
            }
        }

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                int temp = board[i][j];
                board[i][j] = find(newMap, i, j,row,col);
            }
        }

    }
    private int find(int[][] map, int row, int col, int rb, int cb){
        int up = 0;
        int down = 0;
        int left = 0;
        int right = 0;

        if(row == 0){
            up = row;
            down = row +1;

        }else if (row == rb -1){
            up = row -1;
            down = row;
        }else{
            up = row -1;
            down = row +1;
        }

        if( col == 0){
            left = col;
            right = col + 1;
        }else if ( col ==  cb -1){
            left = col -1;
            right = col;
        }else{
            left = col -1;
            right = col + 1;
        }

        int  countOne = 0;

        for(int i = up; i <= down && i < rb; i++){
            for(int j = left; j<=right && j < cb;j++){
                if(map[i][j] == 1){
                    countOne++;
                }
            }
        }

        if(map[row][col] == 1){
            if(countOne <=2){
                return 0;
            }else if (countOne ==3 || countOne ==4){
                return 1;
            }else{
                return 0;
            }
        }else{
            if(countOne == 3){
                return 1;
            }else{
                return 0;
            }
        }


    }
}
