import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        String result = str2.substring(1, str2.length());
        if(str2.contains(str1)){
            return 1;
        } else return 0;
    }
}