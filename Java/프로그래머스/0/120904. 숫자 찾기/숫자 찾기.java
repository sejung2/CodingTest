import java.util.*;
class Solution {
    public int solution(int num, int k) {
        Deque<Integer> list = new ArrayDeque<>();
        while(num != 0){
            list.offerFirst(num%10);
            num /= 10;
        }
        int end = list.size();
        for(int i = 1; i <= end; i++){
            if(k == list.poll()){
                return i;
            }
        }
        return -1;
    }
}