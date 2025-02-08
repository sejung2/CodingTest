import java.util.*;
class Solution {
    public String solution(String my_string) {
        StringBuilder word = new StringBuilder();
        for(int i = 0; i < my_string.length(); i++){
            char input = my_string.charAt(i);
            if(word.indexOf(Character.toString(input)) == -1){
                word.append(input);
            }
        }
        return word.toString();
    }
}