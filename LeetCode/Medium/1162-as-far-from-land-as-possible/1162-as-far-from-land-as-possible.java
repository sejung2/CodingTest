class Solution {
    int[] dx = { 1, -1, 0, 0 };
    int[] dy = { 0, 0, -1, 1 };

    public int maxDistance(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();
        int water = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    queue.add(new int[] { i, j });
                } else
                    water++;
            }
        }

        if (water == 0 || queue.isEmpty())
            return -1;
        int result = 0;

        while (!queue.isEmpty() && water > 0) {
            result++;
            int size = queue.size();

            for (int s = 0; s < size; s++) {
                int[] current = queue.poll();

                for (int i = 0; i < 4; i++) {
                    int nx = current[0] + dx[i];
                    int ny = current[1] + dy[i];

                    if (nx < 0 || ny < 0 || nx >= m || ny >= n || grid[nx][ny] != 0) {
                        continue;
                    }

                    grid[nx][ny] = 1;
                    water--;

                    queue.add(new int[] { nx, ny });
                }
            }
        }
        return result;
    }
}