import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> queue = new LinkedList<>();
        
        for (int i : arr) {
            if (queue.isEmpty() || queue.peekLast() != i) {
                queue.offer(i);
            }
        }
        
        int size = queue.size();
        int[] answer = new int[size];
        for (int i = 0; i < size; i++) {
            answer[i] = queue.pollFirst();
        }

        return answer;
    }
}