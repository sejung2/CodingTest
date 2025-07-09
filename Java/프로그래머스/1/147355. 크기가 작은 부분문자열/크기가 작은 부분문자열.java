import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int length = p.length();
        int end = t.length() - length + 1;
        long pValue = Long.valueOf(p);
        for(int i = 0; i < end; i++){
            if(Long.valueOf(t.substring(i, i + length)) <= pValue){
                answer++;
            }
        }
        return answer;
    }
}