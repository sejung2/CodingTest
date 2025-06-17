import java.util.ArrayDeque;
import java.util.Deque;
class Solution {
    public Deque<Integer> solution(int[] arr, int[] query) {
        Deque<Integer> queue = new ArrayDeque<>();
        for(int i = 0; i < arr.length; i++){
            queue.add(arr[i]);
        }
        for(int i = 0; i < query.length; i++){
            int len = queue.size();
            if(i % 2 == 0){
                for(int j = 1; j < len - query[i]; j++){
                    queue.pollLast();
                }
            } else {
                for(int j = 0; j < query[i]; j++){
                    queue.pollFirst();
                }
            }
        }
        return queue;
    }
}