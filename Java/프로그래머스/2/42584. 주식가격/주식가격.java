import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        Deque<Integer> stack = new LinkedList<>();
        
        int[] result = new int[prices.length];
        
        for(int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[i] < prices[stack.peekLast()]) {
                int index = stack.pollLast();
                result[index] = i - index;
            }
            stack.offerLast(i);
        }
        
        int lastTime = prices.length - 1;
        
        while (!stack.isEmpty()) {
            int index = stack.pollLast();
            result[index] = lastTime - index;
        }
        
        return result;
    }
}