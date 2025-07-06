import java.util.*;

class Solution {
    public Set<Integer> solution(int[] arr, int divisor) {
        Set<Integer> set = new TreeSet<>();
        for(int i : arr){
            if(i % divisor == 0){
                set.add(i);
            }
        }
        if(set.size() == 0){
            set.add(-1);
            return set;
        }
        return set;
    }
}