import java.util.*;
class Solution {
    public String solution(String myString, String pat) {
        int length = myString.length();
        for(int i = 0; i < length; i++){
            if(myString.endsWith(pat)){
                return myString;
            } else myString = myString.substring(0, length - 1 - i);
        }
        return myString;
    }
}