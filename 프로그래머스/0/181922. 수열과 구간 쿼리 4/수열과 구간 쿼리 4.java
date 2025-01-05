import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr.clone();
        
        for(int i = 0; i < queries.length; i++){
            int stand = queries[i][2];
            int start = queries[i][0]; 
            int end = queries[i][1]+1;
            
            for(int j = start; j < end; j++){
                if(j % stand == 0){
                    answer[j]++;
                }
            }
        }
        return answer;
    }
}