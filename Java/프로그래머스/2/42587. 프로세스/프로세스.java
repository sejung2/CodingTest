import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        Deque<int[]> process = new LinkedList<>();
        
        for (int i = 0; i < priorities.length; i++) {
            process.offer(new int[]{i, priorities[i]});
        }
        
        int answer = 0;
        
        while(!process.isEmpty()) {
            int[] current = process.pollFirst();
            boolean pass = false;
            
            for (int[] p : process) {
                if (p[1] > current[1]) {
                    pass = true;
                    break;
                }
            }
            
            if (pass) {
                process.offer(current);
            } else {
                answer++;
                
                if (current[0] == location) {
                    return answer;
                }
            }
        }
        return answer;
    }
}