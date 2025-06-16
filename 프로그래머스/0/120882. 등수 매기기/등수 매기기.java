import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        List<Double> answer = new ArrayList<>();;
        int[] result = new int[score.length];
        
        for(int i = 0; i < score.length; i++){
            double aver = (double)(score[i][0] + score[i][1]) / 2;
            answer.add(aver);
        }
        
        for(int i = 0; i < score.length; i++){
            int rank = 1;
            for(int j = 0; j < score.length; j++){
                if(answer.get(i) < answer.get(j)){
                    rank++;
                } 
            }
            result[i] = rank;
        }
        
        return result;
    }
}