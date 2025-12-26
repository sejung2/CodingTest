class Solution {
    
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    int N, M;

    public int maxAreaOfIsland(int[][] grid) {
        N = grid.length;
        M = grid[0].length;
        int max = 0;

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if (grid[i][j] == 1) {
                    int current = dfs(grid, i, j);
                    max = Math.max(max, current);
                }
            }
        }
        return max;
    }

    int dfs(int[][] grid, int x, int y) {
        int sum = 0;
        if(x < 0 || y < 0 || x >= N || y >= M || grid[x][y] == 0 || grid[x][y] == 2) {
            return 0;
        }

        grid[x][y] = 2;
        sum++;

        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            sum += dfs(grid, nx, ny);
        }
        return sum;
    }
}