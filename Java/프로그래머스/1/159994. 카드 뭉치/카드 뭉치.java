import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int ptr1 = 0, ptr2 = 0;
        
        for(int i = 0; i < goal.length; i++){
            if(ptr1 < cards1.length && goal[i].equals(cards1[ptr1])){
                ptr1++;
            } else if(ptr2 < cards2.length && goal[i].equals(cards2[ptr2])){
                ptr2++;
            } else return "No";
        }
        return "Yes";
    }
}