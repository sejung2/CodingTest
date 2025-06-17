import java.util.*;
class Solution {
    public String solution(String s) {
        Map<Character, Integer> num = new TreeMap<>();
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char input = s.charAt(i);
            if(num.containsKey(input)){
                num.put(input, num.getOrDefault(input, 0) + 1);
            } else num.put(input, 1);
        }
        
        for(Map.Entry<Character, Integer> entry : num.entrySet()){
            if(entry.getValue() == 1){
                answer.append(entry.getKey());
            }
        }
        return answer.toString();
    }
}