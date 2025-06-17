import java.util.*;
class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        for(int[] query : queries){
            int s = query[0];
            int e = query[1];
            String re = "";
            for(int i = e; i > s -1; i--){
                re += my_string.charAt(i);
            }
            String first = my_string.substring(0, s);
            String end = my_string.substring(e+1);
            
            my_string = first + re + end;
        }
        return my_string;
    }
}