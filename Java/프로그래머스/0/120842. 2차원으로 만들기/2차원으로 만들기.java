import java.util.*;
class Solution {
    public int[][] solution(int[] num_list, int n) {
        int elem = num_list.length / n;
        int[][] answer = new int[elem][n];
        int index = 0;
        for(int i = 0; i < elem; i++){
            for(int j = 0; j < n; j++){
                answer[i][j] = num_list[index++];
            }
        }
        return answer;
    }
}