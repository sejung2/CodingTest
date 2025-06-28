import java.util.*;

class Solution {
    public String solution(String s, int n) {
        StringBuilder word = new StringBuilder();
        char[] target = s.toCharArray();
        
        for(int i = 0; i < target.length; i++){
            char input = (char)(target[i] +n);
            if(target[i] > 64 && target[i] < 91){
                if(input > 90){
                    word.append((char)(input - 26));
                } else word.append(input);
            } else if(target[i] > 96 && target[i] < 123){
                if(input > 122){
                    word.append((char)(input - 26));
                } else word.append(input);
            } else word.append(target[i]);
        }
        
        return word.toString();
    }
}