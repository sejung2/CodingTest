import java.util.*;
class Solution {
    public String solution(String myString) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i) < 108){
                result.append("l");
            } else result.append(myString.charAt(i));
        }
        return result.toString();
    }
}