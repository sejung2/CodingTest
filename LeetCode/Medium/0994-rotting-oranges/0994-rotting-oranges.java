class Solution {
    int[] dx = { -1, 1, 0, 0 };
    int[] dy = { 0, 0, -1, 1 };

    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j] == 2) {
                    queue.add(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        if (fresh == 0) return 0;
        int minute = 0;

        while(!queue.isEmpty() && fresh > 0) {
            minute++;
            int size = queue.size();

            for(int s = 0; s < size; s++) {
                int[] current = queue.poll();

                for (int i = 0; i < 4; i++) {
                    int nx = current[0] + dx[i];
                    int ny = current[1] + dy[i];

                    if (nx < 0 || ny < 0 || nx >= m || ny >= n || grid[nx][ny] != 1) {
                        continue;
                    }
                    grid[nx][ny] = 2;
                    fresh--;
                    queue.add(new int[]{nx, ny});
                }
            }
        }
        return fresh == 0 ? minute : -1;
    }
}