import java.util.*;
public class LeetCode212 {
    public List<String> findWords(char[][] board, String[] words) {
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[0].length; j++) {
                for(String word : words){
                    if (bfs(board, i, j, word, 0)){
                        if(!ans.contains(word)){
                            ans.add(word);
                        }
                    }
                }

            }

        return ans;
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
