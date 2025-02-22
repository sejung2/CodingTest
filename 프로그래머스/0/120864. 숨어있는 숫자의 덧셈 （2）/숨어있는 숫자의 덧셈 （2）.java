import java.util.*;
class Solution {
    public int solution(String my_string) {
        String[] num = my_string.split("[^0-9]");
        int answer = 0;
        for(String s : num){
            if(!s.equals("")){
                answer += Integer.parseInt(s);
            }
        }
        return answer;
    }
}