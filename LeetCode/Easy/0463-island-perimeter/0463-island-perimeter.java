class Point {
    int x, y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Solution {
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};

    public int islandPerimeter(int[][] grid) {
        int sum = 0;
        int n = grid.length;
        int m = grid[0].length;

        int[][] visit = new int[n][m];
        Queue<Point> queue = new LinkedList<>();

        boolean foundStart = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    queue.add(new Point(i, j));
                    visit[i][j] = 1;
                    foundStart = true;
                    break;
                }
            }
            if (foundStart) {
                break;
            }
        }

        while(!queue.isEmpty()) {
            Point current = queue.poll();

            for(int i = 0; i < 4; i++){
                int nextX = current.x + dx[i];
                int nextY = current.y + dy[i];

                if(nextX < 0 || nextX >= n || nextY < 0 || nextY >= m || grid[nextX][nextY] == 0){
                    sum++;
                } else {
                    if(grid[nextX][nextY] == 1 && visit[nextX][nextY] == 0){
                        queue.add(new Point(nextX, nextY));
                        visit[nextX][nextY] = 1;
                    }
                }
            }
        }
        return sum;
    }
}