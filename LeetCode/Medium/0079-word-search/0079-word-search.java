class Solution {

    int[] dx = { -1, 1, 0, 0 };
    int[] dy = { 0, 0, -1, 1 };

    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(board, i, j, 0, word)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, int x, int y, int index, String word) {
        if (index == word.length()) {
            return true;
        }

        if (x < 0 || y < 0 || x >= board.length || y >= board[0].length || board[x][y] != word.charAt(index))
            return false;

        char current = board[x][y];
        board[x][y] = '#';

        for (int i = 0; i < 4; i++) {
            if(dfs(board, x + dx[i], y + dy[i], index + 1, word)) {
                return true;
            }
        }
        board[x][y] = current;

        return false;
    }
}