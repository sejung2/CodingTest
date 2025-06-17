import java.util.*;
class Solution {
    public Deque<Integer> solution(int[] num_list, int n) {
        Deque<Integer> queue = new ArrayDeque<>();
        for(int i = 0; i < num_list.length; i++){
            queue.add(num_list[i]);
        }
        for(int i = 0; i < n; i++){
            queue.offerLast(queue.pollFirst());
        }
        return queue;
    }
}