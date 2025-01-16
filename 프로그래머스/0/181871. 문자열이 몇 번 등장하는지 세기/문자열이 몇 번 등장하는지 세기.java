import java.util.*;
class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int stand = pat.length();
        StringBuilder stamp = new StringBuilder();
        
        for(int i = 0; i < stand; i++){
            stamp.append(myString.charAt(i));
        }
        
        if(pat.equals(stamp.toString())){
                answer++;
        }
        
        for(int i = stand; i < myString.length(); i++){
            stamp.delete(0, 1);
            stamp.append(myString.charAt(i));
            if(pat.equals(stamp.toString())){
                answer++;
            }
        }
        
        return answer;
    }
}