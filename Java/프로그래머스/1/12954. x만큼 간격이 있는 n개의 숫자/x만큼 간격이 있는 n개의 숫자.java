import java.util.*;

class Solution {
    public List<Long> solution(int x, int n) {
        List<Long> list = new ArrayList<>();
        long sum = 0;
        for(int i = 0; i < n; i++){
            sum += x;
            list.add(sum);
        }
        return list;
    }
}