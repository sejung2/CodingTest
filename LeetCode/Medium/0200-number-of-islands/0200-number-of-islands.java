class Solution {
    // 상,하,좌,우
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};

    int N;
    int M;

    public int numIslands(char[][] grid) {
        N = grid.length;
        M = grid[0].length;

        int result = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    result++;
                }
            }
        }
        return result;
    }

    void dfs(char[][] grid, int x, int y) {
        if(x < 0 || y < 0 || x == N || y == M || grid[x][y] == '0' || grid[x][y] == '2') {
            return;
        }

        grid[x][y] = '2';

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            dfs(grid, nx, ny);
        }
    }
}