import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        Deque<Character> queue = new LinkedList<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                queue.offer(c);
            } else if (c == ')') {
                if (queue.poll() == null) {
                    return false;
                }
            }
        }

        return queue.size() == 0 ? true : false;
    }
}