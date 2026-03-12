import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Deque<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            queue.offer((100 - progresses[i] + speeds[i] - 1) / speeds[i]);
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        
        while (!queue.isEmpty()) {
            int count = 1;
            int current = queue.pollFirst();
            
            while (!queue.isEmpty() && queue.peekFirst() <= current) {
                queue.pollFirst();
                count++;
            }
            
            result.add(count);
        }
        
        int[] answer = new int[result.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}