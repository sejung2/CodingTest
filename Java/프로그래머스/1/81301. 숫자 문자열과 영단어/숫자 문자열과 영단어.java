import java.util.*;

class Solution {
    public int solution(String s) {
        String[] abc = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i < abc.length; i++){
            if(s.contains(abc[i])){
                s = s.replace(abc[i], ""+ i);
            }
        }
        return Integer.parseInt(s);
    }
}