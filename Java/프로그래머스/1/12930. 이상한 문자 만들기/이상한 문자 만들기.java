import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean flag = false;
        for(int i = 0; i < s.length(); i++){
            char word = s.charAt(i);
            if(word == ' '){
                answer.append(word);
                flag = false;
            } else {
                if(flag){
                    answer.append(Character.toLowerCase(word));
                    flag = false;
                } else {
                    answer.append(Character.toUpperCase(word));
                    flag = true;
                }
            }
        }
        return answer.toString();
    }
}