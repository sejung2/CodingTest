import java.util.*;
class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int o_len = overwrite_string.length();
        int m_len = my_string.length();
        
        answer = my_string.substring(0,s) + overwrite_string + my_string.substring(s+o_len,m_len);
        return answer;
    }
}