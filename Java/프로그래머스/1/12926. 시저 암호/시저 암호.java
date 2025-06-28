import java.util.*;

class Solution {
    public String solution(String s, int n) {
        StringBuilder word = new StringBuilder();
        char[] target = s.toCharArray();
        
        for(int i = 0; i < target.length; i++){
            if(target[i] == ' '){
                word.append(target[i]);
                continue;
            }
            
            if(Character.isUpperCase(target[i])){
                char base = 'A';
                int input = target[i] - base;
                int dist = (input + n) % 26;
                word.append((char)(dist + base));
            } else {
                char base = 'a';
                int input = target[i] - base;
                int dist = (input + n) % 26;
                word.append((char)(dist + base));
            }
        }
        
        return word.toString();
    }
}