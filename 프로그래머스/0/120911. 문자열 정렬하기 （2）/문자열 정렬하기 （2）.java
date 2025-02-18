import java.util.*;
class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
        char[] cArr = my_string.toCharArray();
        Arrays.sort(cArr);
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < my_string.length(); i++){
            answer.append(cArr[i]);
        }
        return answer.toString();
    }
}