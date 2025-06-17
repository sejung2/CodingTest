import java.util.*;
class Solution {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        String[] battle = rsp.split("");
        for(int i = 0; i < battle.length; i++){
            if(battle[i].equals("0")){
                answer.append("5");
            } else if(battle[i].equals("2")){
                answer.append("0");
            } else if(battle[i].equals("5")){
                answer.append("2");
            }
        }
        return answer.toString();
    }
}