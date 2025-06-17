import java.util.*;
class Solution {
    public int solution(int order) {
        int answer = 0;
        ArrayList<Integer> clap = new ArrayList<>(Arrays.asList(3,6,9));
        while(order > 0){
            if(clap.contains((order % 10))){
                answer++;
                order /= 10;
            } else order /= 10;
        }
        return answer;
    }
}