import java.util.*;

class Solution {
    public String solution(String s) {
        String[] words = s.split("");
        List<String> big = new ArrayList();
        List<String> small = new ArrayList();
        
        for(int i = 0; i < s.length(); i++){
            if(words[i].charAt(0) > 90){
                small.add(words[i]);
            } else big.add(words[i]);
        }
        
        Collections.sort(big);
        Collections.sort(small);
        
        String answer = "";
        for(int i = small.size() - 1; i >= 0; i--){
            answer += small.get(i);
        }
        for(int i = big.size() - 1; i >= 0; i--){
            answer += big.get(i);
        }
        
        return answer;
    }
}