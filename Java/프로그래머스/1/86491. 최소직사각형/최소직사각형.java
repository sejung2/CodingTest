import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        for(int i = 0; i < sizes.length; i++){
            Arrays.sort(sizes[i]);
        }
        int max = sizes[0][0];
        int min = sizes[0][1];
        for(int i = 0; i < sizes.length; i++){
            if(max < sizes[i][0]) max = sizes[i][0];
            if(min < sizes[i][1]) min = sizes[i][1];
        }
        
        return max * min;
        
    }
}