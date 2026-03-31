import java.util.*;

class Point {
    int x;
    int y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Solution {
    
    final int[] dx = {-1, 1, 0, 0};
    final int[] dy = {0, 0, -1, 1};
    
    public int solution(int[][] maps) {
        int m = maps.length;
        int n = maps[0].length;
        
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(0, 0));
        
        while (!queue.isEmpty()) {
            Point pos = queue.poll();
            
            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + pos.x;
                int ny = dy[i] + pos.y;
                if (nx < 0 || ny < 0 || nx >= m || ny >= n || maps[nx][ny] != 1) {
                    continue;
                }
                queue.add(new Point(nx, ny));
                maps[nx][ny] = maps[pos.x][pos.y] + 1;
            }
        }
        return maps[m - 1][n - 1] == 1 ? -1 : maps[m - 1][n - 1];
    }
}