import java.util.*;
class Solution {
    public int solution(String[] order) {
        int result = 0;
        int amerinacno = 4500;
        int cafelatte = 5000;
        
        for(int i = 0; i < order.length; i++){
            if(order[i].contains("cafelatte")){
                result += cafelatte;
            } else {
                result += amerinacno;
            }
        }
        return result;
    }
}