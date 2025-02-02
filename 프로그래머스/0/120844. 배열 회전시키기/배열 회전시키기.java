import java.util.*;
class Solution {
    public Deque<Integer> solution(int[] numbers, String direction) {
        Deque<Integer> que = new ArrayDeque<>();
        for(int i : numbers){
            que.offer(i);
        }
        if(direction.equals("right")){
            int turn = que.pollLast();
            que.offerFirst(turn);
        } else if(direction.equals("left")){
            int turn = que.pollFirst();
            que.offerLast(turn);
        }
        return que;
    }
}