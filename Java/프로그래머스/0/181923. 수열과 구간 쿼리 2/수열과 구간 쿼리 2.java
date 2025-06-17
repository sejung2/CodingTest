import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i = 0; i < queries.length; i++){
            int stand = queries[i][2];
            int start = queries[i][0];
            int end = queries[i][1]+1;
            int[] array = Arrays.copyOfRange(arr, start, end);
            
            Arrays.sort(array);
            for(int j = 0; j < array.length; j++){
                if(array[j] > stand){
                    answer[i] = array[j];
                    break;
                } else if(j == array.length-1){
                    answer[i] = -1;
                    break;
                }
            }
           
        }
        return answer;
    }
}