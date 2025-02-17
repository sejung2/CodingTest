import java.util.*;
class Solution {
    public ArrayList<String> solution(String[] quiz) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < quiz.length; i++){
            String[] cul = quiz[i].split(" ");
            int result = 0;
            int a = Integer.parseInt(cul[0]);
            int b = Integer.parseInt(cul[2]);
            if(cul[1].equals("-")){
                result = a - b;
            } else if(cul[1].equals("+")){
                result = a + b;
            }
            if(result != Integer.parseInt(cul[4])){
                list.add("X");
            } else list.add("O");
        }
        return list;
    }
}