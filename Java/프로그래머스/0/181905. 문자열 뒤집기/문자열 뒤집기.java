import java.util.*;
class Solution {
    public String solution(String my_string, int s, int e) {
        String start = my_string.substring(0, s);
        String reverse = my_string.substring(s, e+1);
        StringBuilder sb = new StringBuilder(reverse);
        reverse = sb.reverse().toString();
        String end = my_string.substring(e+1, my_string.length());
        return start + reverse + end;
    }
}