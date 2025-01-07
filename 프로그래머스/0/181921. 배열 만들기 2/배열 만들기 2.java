import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();
        String regex = "^[05]*$";
        for(int i = l; i <= r; i++){
            String num = String.valueOf(i);
            if(num.matches("[05]+")){
                answer.add(i);
            }
        }
        if(answer.size() == 0) answer.add(-1);
        return answer;
    }
}