import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int[] x = new int[4];
        int[] y = new int[4];
        for(int i = 0; i < dots.length; i++){
             x[i] = dots[i][0];
             y[i] = dots[i][1];
        }
        Arrays.sort(x);
        Arrays.sort(y);
        int width = x[x.length - 1] - x[0];
        int height = y[y.length -1] - y[0];
        return width * height;
    }
}