import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        List<Long> list = new ArrayList<>();
        while(n > 0){
            list.add(n % 10);
            n /= 10;
        }
        Collections.sort(list);
        
        for(int i = list.size()-1; i >= 0; i--){
            answer += list.get(i);
            if(i > 0){
                answer *= 10;
            }
        }
        return answer;
    }
}