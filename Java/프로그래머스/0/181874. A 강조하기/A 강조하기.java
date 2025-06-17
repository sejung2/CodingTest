import java.util.*;
class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < myString.length(); i++){
            char up = myString.charAt(i);
            if(up == 'a' || up == 'A'){
                sb.append("A");
            } else if(Character.isUpperCase(up)){
                sb.append(Character.toLowerCase(up));
            } else sb.append(up);
        }
        return sb.toString();
    }
}