import java.util.*;

class Solution {
    public String solution(String s) {
        char[] words = s.toCharArray();
        Arrays.sort(words);
        
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < words.length; i++){
            answer.append(words[i]);
        }
        return answer.reverse().toString();
    }
}