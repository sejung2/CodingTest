import java.util.*;
class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int val : array){
            map.put(val, map.getOrDefault(val,0)+1);
        }
        
        int max = 0;
        int value = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                value = entry.getKey();
            } else if(entry.getValue() == max){
                value = -1;
            }
        }
        return value;
    }
}