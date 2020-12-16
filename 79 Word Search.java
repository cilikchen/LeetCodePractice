class Solution {
   public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[0].length; j++) {
                if (bfs(board, i, j, word, 0))
                    return true;
            }
        return false;
    }
    private boolean bfs(char[][] board, int i, int j, String word, int ind) {
        if (ind == word.length()) return true;
        if (i >= board.length || i < 0 || j < 0 || j >= board[0].length || board[i][j] != word.charAt(ind))
            return false;
        board[i][j] = '-';
        boolean result = bfs(board, i - 1, j, word, ind + 1) ||
                bfs(board, i, j - 1, word, ind + 1) ||
                bfs(board, i, j + 1, word, ind + 1) ||
                bfs(board, i + 1, j, word, ind + 1);
        board[i][j] = word.charAt(ind);
        return result;
    }
}
