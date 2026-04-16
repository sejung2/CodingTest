import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[][] patterns = {{1,2,3,4,5},
                            {2,1,2,3,2,4,2,5},
                            {3,3,1,1,2,2,4,4,5,5}
                           };
        
        int[] sums = new int[3];
        
        for (int i = 0; i < sums.length; i++) {
            for (int j = 0; j < answers.length; j++) {
                if (answers[j] == patterns[i][j % patterns[i].length]) {
                    sums[i] += 1;
                }
            }
        }
        
        int max = 0;
        
        for(int i = 0; i < sums.length; i++) {
            if (max < sums[i]) {
                max = sums[i];
            }
        }
        
        List<Integer> students = new ArrayList<>();
        
        for (int i = 0; i < sums.length; i++) {
            if (sums[i] == max) {
                students.add(i + 1);
            }
        }
        
        int[] result = new int[students.size()];
        for(int i = 0; i < result.length; i++) {
            result[i] = students.get(i);
        }
        return result;
    }
}