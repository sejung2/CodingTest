import java.util.*;
class Solution {
    public int solution(String number) {
        int answer = 0;
        for(int i = 0; i < number.length(); i++){
            char num = number.charAt(i);
            answer += Integer.parseInt(String.valueOf(num));
        }
        answer = answer % 9;
        return answer;
    }
}