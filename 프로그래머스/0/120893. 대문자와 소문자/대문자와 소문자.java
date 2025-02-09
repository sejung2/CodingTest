import java.util.*;
class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < my_string.length(); i++){
            char word = my_string.charAt(i);
            if(Character.isUpperCase(word)){
                answer.append(Character.toLowerCase(word));
            } else answer.append(Character.toUpperCase(word));
        }
        return answer.toString();
    }
}