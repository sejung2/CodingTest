import java.util.*;
class Solution {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i < my_string.length(); i++){
            char word = my_string.charAt(i);
            for(int j = 0; j < n; j++){
                answer.append(word);
            }
        }
        return answer.toString();
    }
}