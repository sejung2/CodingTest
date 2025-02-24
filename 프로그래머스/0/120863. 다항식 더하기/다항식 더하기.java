import java.util.*;
class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] problem = polynomial.split(" ");
        int x = 0, num = 0;
        for(int i = 0; i < problem.length; i++){
            if(problem[i].contains("x")){
                if(problem[i].equals("x")){
                    x++;
                } else {
                    x += Integer.parseInt(problem[i].substring(0, problem[i].length()-1));
                }
            } else if(!problem[i].equals("+")){
                num += Integer.parseInt(problem[i]);
            }
        }
        if(x == 0){
            return "" + num;
        } else if(num == 0){
            return x > 1 ? x + "x" : "x";
        } return  x > 1 ? x + "x + " + num : "x + " + num;
    }
}