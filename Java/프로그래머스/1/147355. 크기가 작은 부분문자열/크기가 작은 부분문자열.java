import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int length = p.length();
        int end = t.length() - length + 1;
        for(int i = 0; i < end; i++){
            if(Long.valueOf(t.substring(i, i + length)) <= Long.valueOf(p)){
                answer++;
            }
        }
        return answer;
    }
}