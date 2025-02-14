import java.util.*;
class Solution {
    public int solution(String my_string) {
        String[] cal = my_string.split(" ");
        int result = Integer.parseInt(cal[0]);
        for(int i = 0; i < cal.length; i++){
            if(cal[i].equals("+")){
                result += Integer.parseInt(cal[i+1]);
            } else if(cal[i].equals("-")){
                result -= Integer.parseInt(cal[i+1]);
            }
        }
        return result;
    }
}