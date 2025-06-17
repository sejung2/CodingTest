import java.util.*;
class Solution {
    public String solution(String n_str) {
        boolean stop = true;
        int i = 0;
        if(n_str.charAt(0) == '0'){
            while(stop){
                if(n_str.charAt(i) != '0'){
                    stop = false;
                }
                i++;
            }
            return n_str.substring(i-1, n_str.length());
        } else return n_str;
    }
}