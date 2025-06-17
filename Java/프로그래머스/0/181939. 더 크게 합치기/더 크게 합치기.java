import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int str1 = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int str2 = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        
        return str1 > str2 ? str1 : str2;
    }
}