class Solution {

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    int N,M;

    public int numIslands(char[][] grid) {
        N = grid.length;
        M = grid[0].length;
        int result = 0;

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if (grid[i][j] == '1') {
                    bfs(grid, i, j);
                    result++;
                }
            }
        }
        return result;
    }

    void bfs(char[][] grid, int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        grid[x][y] = '2';

        while (!q.isEmpty()) {
            int[] current = q.poll();
            int cx = current[0];
            int cy = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx < 0 || ny < 0 || nx >= N || ny >= M || grid[nx][ny] == '0' || grid[nx][ny] == '2') {
                    continue;
                }

                q.add(new int[]{nx, ny});
                grid[nx][ny] = '2';
            }
        }
    }
}