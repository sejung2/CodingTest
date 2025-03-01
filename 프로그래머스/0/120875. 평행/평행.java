import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        float x1 = Math.abs(dots[1][0]-dots[0][0]);
        float x2 = Math.abs(dots[3][0]-dots[2][0]);
        float y1 = Math.abs(dots[1][1]-dots[0][1]);
        float y2 = Math.abs(dots[3][1]-dots[2][1]);
        if(y1/x1 == y2/x2){
            return 1;
        } else return 0;
    }
}