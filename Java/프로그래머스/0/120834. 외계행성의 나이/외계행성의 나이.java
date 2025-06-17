import java.util.*;
class Solution {
    public String solution(int age) {
        String answer = "";
        while(age != 0){
            int change = age % 10;
            answer = (char)(change + 97) + answer;
            age = age / 10;
        }
        return answer;
    }
}