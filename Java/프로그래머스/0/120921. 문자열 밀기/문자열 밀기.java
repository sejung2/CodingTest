import java.util.*;

class Solution {
    public int solution(String A, String B) {
        Deque<Character> strA = new ArrayDeque<>();
        Deque<Character> strB = new ArrayDeque<>();
        
        for(int i = 0; i < A.length(); i++){
            strA.offer(A.charAt(i));
        }
        for(int i = 0; i < A.length(); i++){
            strB.offer(B.charAt(i));
        }
        
        int count = 0;
        
        for(int i = 0; i < A.length(); i++){
            if(strA.toString().equals(strB.toString())){
                return count;
            } else {
                strA.offerFirst(strA.pollLast());
                count++;
            }
        }
        return -1;
    }
}