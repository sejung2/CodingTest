import java.util.*;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] list = my_string.replaceAll("[^0-9]", "").split("");
        for(int i = 0; i < list.length; i++){
            answer += Integer.parseInt(list[i]);
        }
        return answer;
    }
}